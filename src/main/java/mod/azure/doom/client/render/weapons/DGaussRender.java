package mod.azure.doom.client.render.weapons;

import mod.azure.doom.client.models.weapons.DGaussModel;
import mod.azure.doom.item.weapons.DGauss;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DGaussRender extends GeoItemRenderer<DGauss> {
	public DGaussRender() {
		super(new DGaussModel());
	}
}