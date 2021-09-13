package mod.azure.doom.item.ammo;

import java.util.List;

import mod.azure.doom.entity.projectiles.ShotgunShellEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ShellAmmo extends Item {

	public final float damage;

	public ShellAmmo(Properties properties, float damageIn) {
		super(properties);
		this.damage = damageIn;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(new TranslatableComponent("\u00A7o" + "Loads shotgun with malicious intent."));
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
	}

	public ShotgunShellEntity createArrow(Level worldIn, ItemStack stack, LivingEntity shooter) {
		ShotgunShellEntity arrowentity = new ShotgunShellEntity(worldIn, shooter);
		arrowentity.setBaseDamage(this.damage);
		return arrowentity;
	}
}