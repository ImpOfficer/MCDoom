package mod.azure.doom.client.render.weapons;

import mod.azure.doom.client.models.weapons.RocketLauncherModel;
import mod.azure.doom.item.weapons.RocketLauncher;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class RocketLauncherRender extends GeoItemRenderer<RocketLauncher> {
	public RocketLauncherRender() {
		super(new RocketLauncherModel());
	}
}