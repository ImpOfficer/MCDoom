package mod.azure.doom.client.models.projectiles;

import mod.azure.doom.DoomMod;
import mod.azure.doom.item.weapons.GrenadeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GrenadeItemModel extends AnimatedGeoModel<GrenadeItem> {
	@Override
	public ResourceLocation getModelResource(GrenadeItem object) {
		return new ResourceLocation(DoomMod.MODID, "geo/doomed_grenade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrenadeItem object) {
		return new ResourceLocation(DoomMod.MODID, "textures/items/doomed_grenade.png");
	}

	@Override
	public ResourceLocation getAnimationResource(GrenadeItem animatable) {
		return new ResourceLocation(DoomMod.MODID, "animations/doomed_grenade.animation.json");
	}
}
