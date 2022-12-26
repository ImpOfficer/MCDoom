package mod.azure.doom.client.render.projectiles;

import org.joml.Matrix3f;
import org.joml.Matrix4f;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;

import mod.azure.doom.DoomMod;
import mod.azure.doom.client.models.projectiles.MeatHookEntityModel;
import mod.azure.doom.config.DoomConfig;
import mod.azure.doom.entity.projectiles.MeatHookEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.util.RenderUtils;

public class MeatHookEntityRenderer extends GeoEntityRenderer<MeatHookEntity> {

	private static final RenderType CHAIN_LAYER = RenderType
			.entitySmoothCutout(new ResourceLocation(DoomMod.MODID, "textures/entity/chain.png"));

	public MeatHookEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new MeatHookEntityModel());
	}

	protected int getBlockLightLevel(MeatHookEntity entityIn, BlockPos partialTicks) {
		return 15;
	}

	@Override
	public void preRender(PoseStack poseStack, MeatHookEntity animatable, BakedGeoModel model,
			MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick,
			int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RenderUtils.faceRotation(poseStack, animatable, partialTick);
		super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight,
				packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void render(MeatHookEntity hookshot, float yaw, float tickDelta, PoseStack poseStack,
			MultiBufferSource provider, int light) {
		super.render(hookshot, yaw, tickDelta, poseStack, provider, light);
		if (hookshot.getOwner()instanceof Player player) {
			poseStack.pushPose();
			double bodyYawToRads = Math.toRadians(player.yBodyRot);
			double radius = DoomConfig.SERVER.enable_noncenter.get() ? 0.8D : 0.0D;
			double startX = player.getX() + radius * Math.cos(bodyYawToRads);
			double startY = player.getY() + (player.getBbHeight() / 3D);
			double startZ = player.getZ() + radius * Math.sin(bodyYawToRads);
			float distanceX = (float) (startX - hookshot.getX());
			float distanceY = (float) (startY - hookshot.getY());
			float distanceZ = (float) (startZ - hookshot.getZ());

			renderChain(distanceX, distanceY, distanceZ, tickDelta, hookshot.tickCount, poseStack, provider, light);
			poseStack.popPose();
		}
	}

	public void renderChain(float x, float y, float z, float tickDelta, int tickCount, PoseStack poseStack,
			MultiBufferSource provider, int light) {
		float lengthXY = Mth.sqrt(x * x + z * z);
		float squaredLength = x * x + y * y + z * z;
		float length = Mth.sqrt(squaredLength);

		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotation((float) (-Math.atan2(z, x)) - 1.5707964F));
		poseStack.mulPose(Axis.XP.rotation((float) (-Math.atan2(lengthXY, y)) - 1.5707964F));
		poseStack.mulPose(Axis.ZP.rotation(25));
		poseStack.pushPose();
		poseStack.translate(0.015, -0.2, 0);

		VertexConsumer vertexConsumer = provider.getBuffer(CHAIN_LAYER);
		float vertX1 = 0F;
		float vertY1 = 0.25F;
		float vertX2 = Mth.sin(6.2831855F) * 0.125F;
		float vertY2 = Mth.cos(6.2831855F) * 0.125F;
		float minU = 0F;
		float maxU = 0.1875F;
		float minV = 0.0F - ((float) tickCount + tickDelta) * 0.01F;
		float maxV = Mth.sqrt(squaredLength) / 8F - ((float) tickCount + tickDelta) * 0.01F;
		PoseStack.Pose entry = poseStack.last();
		Matrix4f matrix4f = entry.pose();
		Matrix3f matrix3f = entry.normal();

		vertexConsumer.vertex(matrix4f, vertX1, vertY1, 0F).color(0, 0, 0, 255).uv(minU, minV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX1, vertY1, length).color(255, 255, 255, 255).uv(minU, maxV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX2, vertY2, length).color(255, 255, 255, 255).uv(maxU, maxV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX2, vertY2, 0F).color(0, 0, 0, 255).uv(maxU, minV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();

		poseStack.popPose();
		poseStack.mulPose(Axis.ZP.rotation(90));
		poseStack.translate(-0.015, -0.2, 0);

		entry = poseStack.last();
		matrix4f = entry.pose();
		matrix3f = entry.normal();

		vertexConsumer.vertex(matrix4f, vertX1, vertY1, 0F).color(0, 0, 0, 255).uv(minU, minV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX1, vertY1, length).color(255, 255, 255, 255).uv(minU, maxV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX2, vertY2, length).color(255, 255, 255, 255).uv(maxU, maxV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
		vertexConsumer.vertex(matrix4f, vertX2, vertY2, 0F).color(0, 0, 0, 255).uv(maxU, minV)
				.overlayCoords(OverlayTexture.NO_OVERLAY).uv2(light).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();

		poseStack.popPose();
	}
}