package mod.azure.doom.client.render.armors;

import mod.azure.doom.client.models.armor.PhobosModel;
import mod.azure.doom.item.armor.PhobosDoomArmor;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PhobosRender extends GeoArmorRenderer<PhobosDoomArmor> {
	public PhobosRender() {
		super(new PhobosModel());
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