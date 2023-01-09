package mod.azure.doom.client.render.armors;

import mod.azure.doom.client.models.armor.EmberModel;
import mod.azure.doom.item.armor.EmberDoomArmor;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EmberRender extends GeoArmorRenderer<EmberDoomArmor> {
	public EmberRender() {
		super(new EmberModel());
	}
	
	@Override
	public GeoBone getLeftBootBone() {
		return this.model.getBone("armorRightBoot").orElse(null);
	}
	
	@Override
	public GeoBone getLeftLegBone() {
		return this.model.getBone("armorRightLeg").orElse(null);
	}
	
	@Override
	public GeoBone getRightBootBone() {
		return this.model.getBone("armorLeftBoot").orElse(null);
	}
	
	@Override
	public GeoBone getRightLegBone() {
		return this.model.getBone("armorLeftLeg").orElse(null);
	}
}