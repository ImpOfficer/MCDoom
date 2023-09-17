package mod.azure.doom;

import mod.azure.azurelib.AzureLibMod;
import mod.azure.azurelib.config.format.ConfigFormats;
import mod.azure.doom.config.DoomConfig;
import mod.azure.doom.util.recipes.GunTableRecipe;
import mod.azure.doom.util.registry.DoomBlocks;
import mod.azure.doom.util.registry.DoomItems;
import mod.azure.doom.util.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class DoomMod implements ModInitializer {

	public static DoomConfig config;
	public static final String MODID = "doom";
	public static RecipeType<GunTableRecipe> GUN_TABLE_RECIPE;
	public static final ResourceLocation BFG = new ResourceLocation(MODID, "bfg");
	public static final ResourceLocation PISTOL = new ResourceLocation(MODID, "pistol");
	public static final ResourceLocation PLASMA = new ResourceLocation(MODID, "plamsa");
	public static final ResourceLocation BFG9000 = new ResourceLocation(MODID, "bfg9000");
	public static final ResourceLocation SHOTGUN = new ResourceLocation(MODID, "shotgun");
	public static final ResourceLocation UNMAYKR = new ResourceLocation(MODID, "unmaykr");
	public static final ResourceLocation UNMAKER = new ResourceLocation(MODID, "unmaykr");
	public static final ResourceLocation BALLISTA = new ResourceLocation(MODID, "ballista");
	public static final ResourceLocation CHAINGUN = new ResourceLocation(MODID, "chaingun");
	public static final ResourceLocation CHAINSAW = new ResourceLocation(MODID, "chainsaw");
	public static final ResourceLocation CRUCIBLE = new ResourceLocation(MODID, "crucible");
	public static final ResourceLocation GUNS = new ResourceLocation(MODID, "crafting_guns");
	public static final ResourceLocation RELOAD_GUN = new ResourceLocation(MODID, "gun_reload");
	public static final ResourceLocation HEAVYCANNON = new ResourceLocation(MODID, "heavycannon");
	public static final ResourceLocation MARAUDERAXE = new ResourceLocation(MODID, "marauderaxe");
	public static final ResourceLocation SUPERSHOTGUN = new ResourceLocation(MODID, "supershotgun");
	public static final ResourceLocation GUN_TABLE_GUI = new ResourceLocation(MODID, "gun_table_gui");
	public static final ResourceLocation ROCKETLAUNCHER = new ResourceLocation(MODID, "rocketlauncher");
	public static final ResourceLocation SENTINELHAMMER = new ResourceLocation(MODID, "sentinelhammer");
	public static final ResourceLocation CHAINSAW_ETERNAL = new ResourceLocation(MODID, "chainsaweternal");
	public static final ResourceLocation DARKLORDCRUCIBLE = new ResourceLocation(MODID, "darklordcrucible");
	public static final ResourceLocation DSG = new ResourceLocation(MODID, "doomed_shotgun");
	public static final ResourceLocation DGAUSS = new ResourceLocation(MODID, "doomed_gauss");
	public static final ResourceLocation DPLASMARIFLE = new ResourceLocation(MODID, "doomed_plasma_rifle");
	public static final ResourceKey<CreativeModeTab> DoomEggItemGroup = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "eggs"));
	public static final ResourceKey<CreativeModeTab> DoomArmorItemGroup = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "armor"));
	public static final ResourceKey<CreativeModeTab> DoomBlockItemGroup = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "blocks"));
	public static final ResourceKey<CreativeModeTab> DoomWeaponItemGroup = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "weapons"));
	public static final ResourceKey<CreativeModeTab> DoomPowerUPItemGroup = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "powerup"));
	public static final RecipeSerializer<GunTableRecipe> GUN_TABLE_RECIPE_SERIALIZER = Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, new ResourceLocation(MODID, "gun_table"), new GunTableRecipe.Serializer());
	public static final TagKey<Block> PAXEL_BLOCKS = TagKey.create(Registries.BLOCK, DoomMod.modResource("paxel_blocks"));

	@Override
	public void onInitialize() {
		config = AzureLibMod.registerConfig(DoomConfig.class, ConfigFormats.json()).getConfigInstance();
		ModRegistry.initialize();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DoomEggItemGroup, FabricItemGroup.builder().icon(() -> new ItemStack(DoomItems.IMP_SPAWN_EGG)) // icon
				.title(Component.translatable("itemGroup.doom.eggs")) // title
				.displayItems((context, entries) -> {
					entries.accept(DoomItems.GORE_NEST_SPAWN_EGG);
					entries.accept(DoomItems.CUEBALL_SPAWN_EGG);
					entries.accept(DoomItems.TENTACLE_SPAWN_EGG);
					entries.accept(DoomItems.TURRET_SPAWN_EGG);
					entries.accept(DoomItems.CHAINGUNNER_SPAWN_EGG);
					entries.accept(DoomItems.GARGOYLE_SPAWN_EGG);
					entries.accept(DoomItems.IMP_SPAWN_EGG);
					entries.accept(DoomItems.STONEIMP_SPAWN_EGG);
					entries.accept(DoomItems.LOST_SOUL_SPAWN_EGG);
					entries.accept(DoomItems.LOST_SOUL_ETERNAL_SPAWN_EGG);
					entries.accept(DoomItems.MAYKR_DRONE_SPAWN_EGG);
					entries.accept(DoomItems.MECH_ZOMBIE_SPAWN_EGG);
					entries.accept(DoomItems.POSSESSED_SCIENTIST_SPAWN_EGG);
					entries.accept(DoomItems.POSSESSED_WORKER_SPAWN_EGG);
					entries.accept(DoomItems.POSSESSED_SOLDIER_SPAWN_EGG);
					entries.accept(DoomItems.SHOTGUNGUY_SPAWN_EGG);
					entries.accept(DoomItems.UNWILLING_SPAWN_EGG);
					entries.accept(DoomItems.ZOMBIEMAN_SPAWN_EGG);
					entries.accept(DoomItems.ARACHNOTRON_SPAWN_EGG);
					entries.accept(DoomItems.ARACHNOTRONETERNAL_SPAWN_EGG);
					entries.accept(DoomItems.BLOOD_MAYKR_SPAWN_EGG);
					entries.accept(DoomItems.CACODEMON_SPAWN_EGG);
					entries.accept(DoomItems.CARCASS_SPAWN_EGG);
					entries.accept(DoomItems.HELLKNIGHT_SPAWN_EGG);
					entries.accept(DoomItems.HELLKNIGHT2016_SPAWN_EGG);
					entries.accept(DoomItems.MANCUBUS_SPAWN_EGG);
					entries.accept(DoomItems.PAIN_SPAWN_EGG);
					entries.accept(DoomItems.PINKY_SPAWN_EGG);
					entries.accept(DoomItems.SPECTRE_SPAWN_EGG);
					entries.accept(DoomItems.PROWLER_SPAWN_EGG);
					entries.accept(DoomItems.REVENANT_SPAWN_EGG);
					entries.accept(DoomItems.REVENANT2016_SPAWN_EGG);
					entries.accept(DoomItems.WHIPLASH_SPAWN_EGG);
					entries.accept(DoomItems.ARCHVILE_SPAWN_EGG);
					entries.accept(DoomItems.BARON_SPAWN_EGG);
					entries.accept(DoomItems.BARON2016_SPAWN_EGG);
					entries.accept(DoomItems.FIREBORNE_BARON_SPAWN_EGG);
					entries.accept(DoomItems.ARMORED_BARON_SPAWN_EGG);
					entries.accept(DoomItems.CYBERDEMON_SPAWN_EGG);
					entries.accept(DoomItems.DOOMHUNTER_SPAWN_EGG);
					entries.accept(DoomItems.MARAUDER_SPAWN_EGG);
					entries.accept(DoomItems.SUMMONER_SPAWN_EGG);
					entries.accept(DoomItems.SPIDERMASTERMIND_SPAWN_EGG);
					entries.accept(DoomItems.SPIDERMASTERMIND2016_SPAWN_EGG);
					entries.accept(DoomItems.ICON_SPAWN_EGG);
					entries.accept(DoomItems.MOTHERDEMON_SPAWN_EGG);
					entries.accept(DoomItems.GLADIATOR_SPAWN_EGG);
					entries.accept(DoomItems.ARCH_MAKYR_SPAWN_EGG);
				}).build()); // build() no longer registers by itself
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DoomArmorItemGroup, FabricItemGroup.builder().icon(() -> new ItemStack(DoomItems.DOOM_HELMET)) // icon
				.title(Component.translatable("itemGroup.doom.armor")) // title
				.displayItems((context, entries) -> {
					entries.accept(DoomItems.DOOM_HELMET);
					entries.accept(DoomItems.DOOM_CHESTPLATE);
					entries.accept(DoomItems.DOOM_LEGGINGS);
					entries.accept(DoomItems.DOOM_BOOTS);
					entries.accept(DoomItems.PRAETOR_DOOM_HELMET);
					entries.accept(DoomItems.PRAETOR_DOOM_CHESTPLATE);
					entries.accept(DoomItems.PRAETOR_DOOM_LEGGINGS);
					entries.accept(DoomItems.PRAETOR_DOOM_BOOTS);
					entries.accept(DoomItems.ASTRO_DOOM_HELMET);
					entries.accept(DoomItems.ASTRO_DOOM_CHESTPLATE);
					entries.accept(DoomItems.ASTRO_DOOM_LEGGINGS);
					entries.accept(DoomItems.ASTRO_DOOM_BOOTS);
					entries.accept(DoomItems.CRIMSON_DOOM_HELMET);
					entries.accept(DoomItems.CRIMSON_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CRIMSON_DOOM_LEGGINGS);
					entries.accept(DoomItems.CRIMSON_DOOM_BOOTS);
					entries.accept(DoomItems.MIDNIGHT_DOOM_HELMET);
					entries.accept(DoomItems.MIDNIGHT_DOOM_CHESTPLATE);
					entries.accept(DoomItems.MIDNIGHT_DOOM_LEGGINGS);
					entries.accept(DoomItems.MIDNIGHT_DOOM_BOOTS);
					entries.accept(DoomItems.DEMONIC_DOOM_HELMET);
					entries.accept(DoomItems.DEMONIC_DOOM_CHESTPLATE);
					entries.accept(DoomItems.DEMONIC_DOOM_LEGGINGS);
					entries.accept(DoomItems.DEMONIC_DOOM_BOOTS);
					entries.accept(DoomItems.DEMONCIDE_DOOM_HELMET);
					entries.accept(DoomItems.DEMONCIDE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.DEMONCIDE_DOOM_LEGGINGS);
					entries.accept(DoomItems.DEMONCIDE_DOOM_BOOTS);
					entries.accept(DoomItems.SENTINEL_DOOM_HELMET);
					entries.accept(DoomItems.SENTINEL_DOOM_CHESTPLATE);
					entries.accept(DoomItems.SENTINEL_DOOM_LEGGINGS);
					entries.accept(DoomItems.SENTINEL_DOOM_BOOTS);
					entries.accept(DoomItems.EMBER_DOOM_HELMET);
					entries.accept(DoomItems.EMBER_DOOM_CHESTPLATE);
					entries.accept(DoomItems.EMBER_DOOM_LEGGINGS);
					entries.accept(DoomItems.EMBER_DOOM_BOOTS);
					entries.accept(DoomItems.ZOMBIE_DOOM_HELMET);
					entries.accept(DoomItems.ZOMBIE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.ZOMBIE_DOOM_LEGGINGS);
					entries.accept(DoomItems.ZOMBIE_DOOM_BOOTS);
					entries.accept(DoomItems.PHOBOS_DOOM_HELMET);
					entries.accept(DoomItems.PHOBOS_DOOM_CHESTPLATE);
					entries.accept(DoomItems.PHOBOS_DOOM_LEGGINGS);
					entries.accept(DoomItems.PHOBOS_DOOM_BOOTS);
					entries.accept(DoomItems.NIGHTMARE_DOOM_HELMET);
					entries.accept(DoomItems.NIGHTMARE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.NIGHTMARE_DOOM_LEGGINGS);
					entries.accept(DoomItems.NIGHTMARE_DOOM_BOOTS);
					entries.accept(DoomItems.PURPLEPONY_DOOM_HELMET);
					entries.accept(DoomItems.PURPLEPONY_DOOM_CHESTPLATE);
					entries.accept(DoomItems.PURPLEPONY_DOOM_LEGGINGS);
					entries.accept(DoomItems.PURPLEPONY_DOOM_BOOTS);
					entries.accept(DoomItems.DOOMICORN_DOOM_HELMET);
					entries.accept(DoomItems.DOOMICORN_DOOM_CHESTPLATE);
					entries.accept(DoomItems.DOOMICORN_DOOM_LEGGINGS);
					entries.accept(DoomItems.DOOMICORN_DOOM_BOOTS);
					entries.accept(DoomItems.GOLD_DOOM_HELMET);
					entries.accept(DoomItems.GOLD_DOOM_CHESTPLATE);
					entries.accept(DoomItems.GOLD_DOOM_LEGGINGS);
					entries.accept(DoomItems.GOLD_DOOM_BOOTS);
					entries.accept(DoomItems.TWENTY_FIVE_DOOM_HELMET);
					entries.accept(DoomItems.TWENTY_FIVE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.TWENTY_FIVE_DOOM_LEGGINGS);
					entries.accept(DoomItems.TWENTY_FIVE_DOOM_BOOTS);
					entries.accept(DoomItems.BRONZE_DOOM_HELMET);
					entries.accept(DoomItems.BRONZE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.BRONZE_DOOM_LEGGINGS);
					entries.accept(DoomItems.BRONZE_DOOM_BOOTS);
					entries.accept(DoomItems.CULTIST_DOOM_HELMET);
					entries.accept(DoomItems.CULTIST_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CULTIST_DOOM_LEGGINGS);
					entries.accept(DoomItems.CULTIST_DOOM_BOOTS);
					entries.accept(DoomItems.MAYKR_DOOM_HELMET);
					entries.accept(DoomItems.MAYKR_DOOM_CHESTPLATE);
					entries.accept(DoomItems.MAYKR_DOOM_LEGGINGS);
					entries.accept(DoomItems.MAYKR_DOOM_BOOTS);
					entries.accept(DoomItems.PAINTER_DOOM_HELMET);
					entries.accept(DoomItems.PAINTER_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CLASSIC_DOOM_HELMET);
					entries.accept(DoomItems.CLASSIC_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CLASSIC_DOOM_LEGGINGS);
					entries.accept(DoomItems.CLASSIC_RED_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CLASSIC_RED_DOOM_LEGGINGS);
					entries.accept(DoomItems.CLASSIC_INDIGO_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CLASSIC_INDIGO_DOOM_LEGGINGS);
					entries.accept(DoomItems.CLASSIC_BRONZE_DOOM_CHESTPLATE);
					entries.accept(DoomItems.CLASSIC_BRONZE_DOOM_LEGGINGS);
					entries.accept(DoomItems.CLASSIC_DOOM_BOOTS);
					entries.accept(DoomItems.MULLET_DOOM_HELMET1);
					entries.accept(DoomItems.MULLET_DOOM_CHESTPLATE1);
					entries.accept(DoomItems.MULLET_DOOM_CHESTPLATE2);
					entries.accept(DoomItems.MULLET_DOOM_CHESTPLATE3);
					entries.accept(DoomItems.MULLET_DOOM_LEGGINGS1);
					entries.accept(DoomItems.MULLET_DOOM_BOOTS1);
					entries.accept(DoomItems.HOTROD_HELMET);
					entries.accept(DoomItems.HOTROD_CHESTPLATE);
					entries.accept(DoomItems.HOTROD_LEGGINGS);
					entries.accept(DoomItems.HOTROD_BOOTS);
					entries.accept(DoomItems.SANTA_HELMET);
					entries.accept(DoomItems.DARKLORD_HELMET);
					entries.accept(DoomItems.DARKLORD_CHESTPLATE);
					entries.accept(DoomItems.DARKLORD_LEGGINGS);
					entries.accept(DoomItems.DARKLORD_BOOTS);
				}).build()); // build() no longer registers by itself
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DoomBlockItemGroup, FabricItemGroup.builder().icon(() -> new ItemStack(DoomBlocks.BARREL_BLOCK)) // icon
				.title(Component.translatable("itemGroup.doom.blocks")) // title
				.displayItems((context, entries) -> {
					entries.accept(DoomBlocks.BARREL_BLOCK);
					entries.accept(DoomBlocks.JUMP_PAD);
					entries.accept(DoomBlocks.DOOM_SAND);
					entries.accept(DoomBlocks.ARGENT_BLOCK);
					entries.accept(DoomBlocks.ARGENT_LAMP_BLOCK);
					entries.accept(DoomBlocks.TOTEM);
					entries.accept(DoomBlocks.GUN_TABLE);
					entries.accept(DoomBlocks.E1M1_1);
					entries.accept(DoomBlocks.E1M1_2);
					entries.accept(DoomBlocks.E1M1_3);
					entries.accept(DoomBlocks.E1M1_4);
					entries.accept(DoomBlocks.E1M1_5);
					entries.accept(DoomBlocks.E1M1_6);
					entries.accept(DoomBlocks.E1M1_7);
					entries.accept(DoomBlocks.E1M1_8);
					entries.accept(DoomBlocks.E1M1_9);
					entries.accept(DoomBlocks.E1M1_10);
					entries.accept(DoomBlocks.E1M1_11);
					entries.accept(DoomBlocks.E1M1_12);
					entries.accept(DoomBlocks.E1M1_13);
					entries.accept(DoomBlocks.E1M1_14);
					entries.accept(DoomBlocks.E1M1_15);
					entries.accept(DoomBlocks.E1M1_16);
					entries.accept(DoomBlocks.E1M1_17);
					entries.accept(DoomBlocks.E1M1_18);
					entries.accept(DoomBlocks.E1M1_19);
					entries.accept(DoomBlocks.E1M1_20);
					entries.accept(DoomBlocks.E1M1_21);
					entries.accept(DoomBlocks.E1M1_22);
					entries.accept(DoomBlocks.E1M1_23);
					entries.accept(DoomBlocks.E1M1_24);
					entries.accept(DoomBlocks.E1M1_25);
					entries.accept(DoomBlocks.E1M1_26);
					entries.accept(DoomBlocks.E1M1_27);
					entries.accept(DoomBlocks.E1M1_28);
					entries.accept(DoomBlocks.E1M1_29);
					entries.accept(DoomBlocks.ICON_WALL1);
					entries.accept(DoomBlocks.ICON_WALL2);
					entries.accept(DoomBlocks.ICON_WALL3);
					entries.accept(DoomBlocks.ICON_WALL4);
					entries.accept(DoomBlocks.ICON_WALL5);
					entries.accept(DoomBlocks.ICON_WALL6);
					entries.accept(DoomBlocks.ICON_WALL7);
					entries.accept(DoomBlocks.ICON_WALL8);
					entries.accept(DoomBlocks.ICON_WALL9);
					entries.accept(DoomBlocks.ICON_WALL10);
					entries.accept(DoomBlocks.ICON_WALL11);
					entries.accept(DoomBlocks.ICON_WALL12);
					entries.accept(DoomBlocks.ICON_WALL13);
					entries.accept(DoomBlocks.ICON_WALL14);
					entries.accept(DoomBlocks.ICON_WALL15);
					entries.accept(DoomBlocks.ICON_WALL16);
				}).build()); // build() no longer registers by itself
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DoomWeaponItemGroup, FabricItemGroup.builder().icon(() -> new ItemStack(DoomItems.BFG_ETERNAL)) // icon
				.title(Component.translatable("itemGroup.doom.weapons")) // title
				.displayItems((context, entries) -> {
					entries.accept(DoomItems.ARGENT_AXE);
					entries.accept(DoomItems.ARGENT_HOE);
					entries.accept(DoomItems.ARGENT_SHOVEL);
					entries.accept(DoomItems.ARGENT_PICKAXE);
					entries.accept(DoomItems.ARGENT_SWORD);
					entries.accept(DoomItems.ARGENT_PAXEL);
					entries.accept(DoomItems.CHAINSAW);
					entries.accept(DoomItems.CHAINSAW64);
					entries.accept(DoomItems.CHAINSAW_ETERNAL);
					entries.accept(DoomItems.PISTOL);
					entries.accept(DoomItems.HEAVYCANNON);
					entries.accept(DoomItems.CHAINGUN);
					entries.accept(DoomItems.SG);
					entries.accept(DoomItems.DSG);
					entries.accept(DoomItems.SSG);
					entries.accept(DoomItems.DPLASMARIFLE);
					entries.accept(DoomItems.PLASMAGUN);
					entries.accept(DoomItems.ROCKETLAUNCHER);
					entries.accept(DoomItems.DGAUSS);
					entries.accept(DoomItems.BALLISTA);
					entries.accept(DoomItems.UNMAKER);
					entries.accept(DoomItems.UNMAYKR);
					entries.accept(DoomItems.BFG);
					entries.accept(DoomItems.BFG_ETERNAL);
					entries.accept(DoomItems.SWORD_CLOSED);
					entries.accept(DoomItems.CRUCIBLESWORD);
					entries.accept(DoomItems.AXE_CLOSED);
					entries.accept(DoomItems.AXE_OPEN);
					entries.accept(DoomItems.DARKLORDCRUCIBLE);
					entries.accept(DoomItems.SENTINELHAMMER);
					entries.accept(DoomItems.GRENADE);
					entries.accept(DoomItems.GAS_BARREL);
					entries.accept(DoomItems.BULLETS);
					entries.accept(DoomItems.SHOTGUN_SHELLS);
					entries.accept(DoomItems.CHAINGUN_BULLETS);
					entries.accept(DoomItems.ROCKET);
					entries.accept(DoomItems.ARGENT_BOLT);
					entries.accept(DoomItems.ENERGY_CELLS);
					entries.accept(DoomItems.BFG_CELL);
				}).build()); // build() no longer registers by itself
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DoomPowerUPItemGroup, FabricItemGroup.builder().icon(() -> new ItemStack(DoomItems.SOULCUBE)) // icon
				.title(Component.translatable("itemGroup.doom.powerup")) // title
				.displayItems((context, entries) -> {
					entries.accept(DoomItems.ARGENT_ENERGY);
					entries.accept(DoomItems.ARGENT_PLATE);
					entries.accept(DoomItems.SOULCUBE);
					entries.accept(DoomItems.INMORTAL);
					entries.accept(DoomItems.INVISIBLE);
					entries.accept(DoomItems.MEGA);
					entries.accept(DoomItems.POWER);
					entries.accept(DoomItems.DAISY);
					entries.accept(DoomItems.E1M1_MUSIC_DISC);
					entries.accept(DoomItems.GEOF_MUSIC_DISC);
				}).build()); // build() no longer registers by itself
		DataTrackers.MEATHOOK_TRACKER.getId();
		FuelRegistry.INSTANCE.add(DoomItems.ARGENT_ENERGY, 32767);
	}

	public static class DataTrackers {
		public static final EntityDataAccessor<Boolean> MEATHOOK_TRACKER = SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);
	}

	public static final ResourceLocation modResource(String name) {
		return new ResourceLocation(MODID, name);
	}
}
