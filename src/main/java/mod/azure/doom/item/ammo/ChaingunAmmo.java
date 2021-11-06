package mod.azure.doom.item.ammo;

import java.util.List;

import mod.azure.doom.entity.projectiles.ChaingunBulletEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ChaingunAmmo extends ArrowItem {

	public final float damage;

	public ChaingunAmmo(Properties properties, float damageIn) {
		super(properties);
		this.damage = damageIn;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("doom.chaingun.text").withStyle(TextFormatting.ITALIC));
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper
				.getItemEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY_ARROWS, bow);
		return enchant <= 0 ? false : this instanceof ChaingunAmmo;
	}

	@Override
	public ChaingunBulletEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		ChaingunBulletEntity arrowentity = new ChaingunBulletEntity(worldIn, shooter);
		arrowentity.setBaseDamage(this.damage);
		return arrowentity;
	}

}