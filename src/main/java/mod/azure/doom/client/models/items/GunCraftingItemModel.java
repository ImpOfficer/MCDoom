package mod.azure.doom.client.models.items;

import mod.azure.doom.DoomMod;
import mod.azure.doom.item.GunTableBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GunCraftingItemModel extends AnimatedGeoModel<GunTableBlockItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(GunTableBlockItem entity) {
		return new ResourceLocation(DoomMod.MODID, "animations/gun_table.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GunTableBlockItem animatable) {
		return new ResourceLocation(DoomMod.MODID, "geo/gun_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GunTableBlockItem entity) {
		return new ResourceLocation(DoomMod.MODID, "textures/blocks/gun_table.png");
	}
}
