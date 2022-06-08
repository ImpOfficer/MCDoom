package mod.azure.doom.item.weapons;

import org.quiltmc.qsl.networking.api.PlayerLookup;
import org.quiltmc.qsl.networking.api.client.ClientPlayNetworking;

import io.netty.buffer.Unpooled;
import mod.azure.doom.DoomMod;
import mod.azure.doom.client.ClientInit;
import mod.azure.doom.config.DoomConfig;
import mod.azure.doom.entity.projectiles.EnergyCellEntity;
import mod.azure.doom.util.enums.DoomTier;
import mod.azure.doom.util.registry.DoomItems;
import mod.azure.doom.util.registry.DoomSounds;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import software.bernie.geckolib3q.network.GeckoLibNetwork;
import software.bernie.geckolib3q.util.GeckoLibUtil;

public class PlasmaGun extends DoomBaseItem {

	public PlasmaGun() {
		super(new Item.Settings().group(DoomMod.DoomWeaponItemGroup).maxCount(1).maxDamage(401));
	}

	@Override
	public boolean canRepair(ItemStack stack, ItemStack ingredient) {
		return DoomTier.PLASMA.getRepairIngredient().test(ingredient) || super.canRepair(stack, ingredient);
	}

	@Override
	public void usageTick(World worldIn, LivingEntity livingEntityIn, ItemStack stack, int count) {
		if (livingEntityIn instanceof PlayerEntity) {
			PlayerEntity playerentity = (PlayerEntity) livingEntityIn;
			if (stack.getDamage() < (stack.getMaxDamage() - 1)) {
				if (!playerentity.getItemCooldownManager().isCoolingDown(this)) {
					playerentity.getItemCooldownManager().set(this, 5);
					if (!worldIn.isClient) {
						EnergyCellEntity abstractarrowentity = createArrow(worldIn, stack, playerentity);
						abstractarrowentity.setProperties(playerentity, playerentity.getPitch(), playerentity.getYaw(),
								0.0F, 0.15F * 3.0F, 1.0F);
						abstractarrowentity.hasNoGravity();

						stack.damage(1, livingEntityIn, p -> p.sendToolBreakStatus(livingEntityIn.getActiveHand()));
						worldIn.spawnEntity(abstractarrowentity);
						worldIn.playSound((PlayerEntity) null, playerentity.getX(), playerentity.getY(),
								playerentity.getZ(), DoomSounds.PLASMA_FIRING, SoundCategory.PLAYERS, 1.0F,
								1.0F / (worldIn.random.nextFloat() * 0.4F + 1.2F) + 1F * 0.5F);
						if (!worldIn.isClient) {
							final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerWorld) worldIn);
							GeckoLibNetwork.syncAnimation(playerentity, this, id, ANIM_OPEN);
							for (PlayerEntity otherPlayer : PlayerLookup.tracking(playerentity)) {
								GeckoLibNetwork.syncAnimation(otherPlayer, this, id, ANIM_OPEN);
							}
						}
						boolean isInsideWaterBlock = playerentity.world.isWater(playerentity.getBlockPos());
						spawnLightSource(livingEntityIn, isInsideWaterBlock);
					}
				}
			} else {
				worldIn.playSound((PlayerEntity) null, playerentity.getX(), playerentity.getY(), playerentity.getZ(),
						DoomSounds.EMPTY, SoundCategory.PLAYERS, 1.0F, 1.5F);
			}
		}
	}

	public void reload(PlayerEntity user, Hand hand) {
		if (user.getStackInHand(hand).getItem() instanceof PlasmaGun) {
			while (!user.isCreative() && user.getStackInHand(hand).getDamage() != 0
					&& user.getInventory().count(DoomItems.ENERGY_CELLS) > 0) {
				removeAmmo(DoomItems.ENERGY_CELLS, user);
				user.getStackInHand(hand).damage(-20, user, s -> user.sendToolBreakStatus(hand));
				user.getStackInHand(hand).setCooldown(3);
				user.getWorld().playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(),
						DoomSounds.CLIPRELOAD, SoundCategory.PLAYERS, 1.00F, 1.0F);
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (world.isClient) {
			if (((PlayerEntity) entity).getMainHandStack().getItem() instanceof PlasmaGun
					&& ClientInit.reload.isPressed() && selected) {
				PacketByteBuf passedData = new PacketByteBuf(Unpooled.buffer());
				passedData.writeBoolean(true);
				ClientPlayNetworking.send(DoomMod.PLASMA, passedData);
			}
		}
	}

	public EnergyCellEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		float j = EnchantmentHelper.getLevel(Enchantments.POWER, stack);
		EnergyCellEntity arrowentity = new EnergyCellEntity(worldIn, shooter,
				(DoomConfig.energycell_damage + (j * 2.0F)));
		return arrowentity;
	}
}