package mod.azure.doom.client.models;

import mod.azure.doom.DoomMod;
import mod.azure.doom.entity.tierfodder.UnwillingEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class UnwillingModel extends GeoModel<UnwillingEntity> {

	@Override
	public ResourceLocation getModelResource(UnwillingEntity object) {
		return new ResourceLocation(DoomMod.MODID, "geo/unwilling.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwillingEntity object) {
		return new ResourceLocation(DoomMod.MODID, "textures/entity/unwilling.png");
	}

	@Override
	public ResourceLocation getAnimationResource(UnwillingEntity object) {
		return new ResourceLocation(DoomMod.MODID, "animations/possessed_scientist_animation.json");
	}

	@Override
	public void setCustomAnimations(UnwillingEntity animatable, long instanceId,
			AnimationState<UnwillingEntity> animationState) {
		super.setCustomAnimations(animatable, instanceId, animationState);

		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

		if (head != null) {
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}
	}

	@Override
	public RenderType getRenderType(UnwillingEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureResource(animatable));
	}

}