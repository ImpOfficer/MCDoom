package mod.azure.doom.enchantments;

import mod.azure.doom.items.enums.GunTypeEnum;
import mod.azure.doom.items.weapons.DoomBaseItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class MicrowaveBeamEnchantment extends Enchantment {

    public MicrowaveBeamEnchantment(EquipmentSlot... slotTypes) {
        super(Rarity.RARE, EnchantmentCategory.BREAKABLE, slotTypes);
    }

    @Override
    public int getMaxCost(int level) {
        return 1;
    }

    @Override
    public int getMinCost(int level) {
        return 1;
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        if (!(stack.getItem() instanceof DoomBaseItem gunItem))
            return false;
        if (gunItem.getGunTypeEnum() == GunTypeEnum.PLAMSA)
            return true;
        if (gunItem.getGunTypeEnum() == GunTypeEnum.DPLASMA)
            return false;
        return false;
    }

}
