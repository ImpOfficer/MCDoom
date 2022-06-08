package mod.azure.doom.client.models.projectiles;

import mod.azure.doom.DoomMod;
import mod.azure.doom.entity.projectiles.entity.EnergyCellMobEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EnergyMobModel extends AnimatedGeoModel<EnergyCellMobEntity> {
	@Override
	public ResourceLocation getModelResource(EnergyCellMobEntity object) {
		return new ResourceLocation(DoomMod.MODID, "geo/smallprojectile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnergyCellMobEntity object) {
		return new ResourceLocation(DoomMod.MODID, "textures/entity/projectiles/plasma_ball.png");
	}

	@Override
	public ResourceLocation getAnimationResource(EnergyCellMobEntity animatable) {
		return new ResourceLocation(DoomMod.MODID, "animations/smallprojectile.animation.json");
	}
}
