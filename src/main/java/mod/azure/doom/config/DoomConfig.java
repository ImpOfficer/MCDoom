package mod.azure.doom.config;

import java.util.Arrays;
import java.util.List;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import mod.azure.doom.DoomMod;

@Config(name = DoomMod.MODID)
public class DoomConfig implements ConfigData {

	@ConfigEntry.Gui.CollapsibleObject
	public Misc misc = new Misc();

	@ConfigEntry.Gui.CollapsibleObject
	public Weapons weapons = new Weapons();

	@ConfigEntry.Gui.CollapsibleObject
	public Spawning spawn = new Spawning();

	@ConfigEntry.Gui.CollapsibleObject
	public MobStats stats = new MobStats();

	public static class Misc {
		public boolean enable_all_villager_trades = true;
		public boolean enable_weaponsmith_trades = true;
		public boolean enable_toolsmith_trades = true;
		public boolean enable_mason_trades = true;
	}

	public static class Weapons {
		public int crucible_marauder_max_damage = 5;
		public boolean enable_block_breaking = false;
		public boolean enable_noncenter = false;
		public float argent_bolt_damage = 14.5F;
		public float bfgball_damage = 100F;
		public float bfgball_damage_dragon = 30F;
		public float bfgball_damage_aoe = 10F;
		public float bullet_damage = 5.5F;
		public float chaingun_bullet_damage = 5.5F;
		public float energycell_damage = 1.5F;
		public float rocket_damage = 20F;
		public float shotgun_damage = 10F;
		public float unmaykr_damage = 2.5F;
		public float grenade_damage = 30F;
		public double max_meathook_distance = 32;
	}

	public static class Spawning {
		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> imp_biomes = Arrays.asList("#nether");
		public int imp_spawn_weight = 15;
		public int imp_min_group = 1;
		public int imp_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> pinky_biomes = Arrays.asList("#nether");
		public int pinky_spawn_weight = 15;
		public int pinky_min_group = 2;
		public int pinky_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> spectre_biomes = Arrays.asList("#nether");
		public int spectre_spawn_weight = 15;
		public int spectre_min_group = 2;
		public int spectre_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> lost_soul_biomes = Arrays.asList("#nether");
		public int lost_soul_spawn_weight = 25;
		public int lost_soul_min_group = 1;
		public int lost_soul_max_group = 3;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> cacodemon_biomes = Arrays.asList("#nether");
		public int cacodemon_spawn_weight = 4;
		public int cacodemon_min_group = 1;
		public int cacodemon_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> archvile_biomes = Arrays.asList("#nether");
		public int archvile_spawn_weight = 4;
		public int archvile_min_group = 1;
		public int archvile_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> baron_biomes = Arrays.asList("#nether");
		public int baron_spawn_weight = 4;
		public int baron_min_group = 1;
		public int baron_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> mancubus_biomes = Arrays.asList("#nether");
		public int mancubus_spawn_weight = 4;
		public int mancubus_min_group = 1;
		public int mancubus_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> revenant_biomes = Arrays.asList("#nether");
		public int revenant_spawn_weight = 4;
		public int revenant_min_group = 1;
		public int revenant_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> zombieman_biomes = Arrays.asList("#nether");
		public int zombieman_spawn_weight = 15;
		public int zombieman_min_group = 1;
		public int zombieman_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> arachnotron_biomes = Arrays.asList("#nether");
		public int arachnotron_spawn_weight = 15;
		public int arachnotron_min_group = 1;
		public int arachnotron_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> gargoyle_biomes = Arrays.asList("#nether");
		public int gargoyle_spawn_weight = 15;
		public int gargoyle_min_group = 1;
		public int gargoyle_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> chaingunner_biomes = Arrays.asList("#nether");
		public int chaingunner_spawn_weight = 15;
		public int chaingunner_min_group = 1;
		public int chaingunner_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> shotgunguy_biomes = Arrays.asList("#nether");
		public int shotgunguy_spawn_weight = 15;
		public int shotgunguy_min_group = 1;
		public int shotgunguy_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> marauder_biomes = Arrays.asList("#nether");
		public int marauder_spawn_weight = 3;
		public int marauder_min_group = 1;
		public int marauder_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> pain_biomes = Arrays.asList("#nether");
		public int pain_spawn_weight = 4;
		public int pain_min_group = 1;
		public int pain_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> hellknight_biomes = Arrays.asList("#nether");
		public int hellknight_spawn_weight = 4;
		public int hellknight_min_group = 1;
		public int hellknight_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> hellknight2016_biomes = Arrays.asList("#nether");
		public int hellknight2016_spawn_weight = 4;
		public int hellknight2016_min_group = 1;
		public int hellknight2016_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> cyberdemon_biomes = Arrays.asList("#nether");
		public int cyberdemon_spawn_weight = 4;
		public int cyberdemon_min_group = 1;
		public int cyberdemon_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> unwilling_biomes = Arrays.asList("#nether");
		public int unwilling_spawn_weight = 15;
		public int unwilling_min_group = 1;
		public int unwilling_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> possessed_scientist_biomes = Arrays.asList("#nether");
		public int possessed_scientist_spawn_weight = 15;
		public int possessed_scientist_min_group = 1;
		public int possessed_scientist_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> possessed_soldier_biomes = Arrays.asList("#nether");
		public int possessed_soldier_spawn_weight = 15;
		public int possessed_soldier_min_group = 1;
		public int possessed_soldier_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> mechazombie_biomes = Arrays.asList("#nether");
		public int mechazombie_spawn_weight = 15;
		public int mechazombie_min_group = 1;
		public int mechazombie_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> cueball_biomes = Arrays.asList("#nether");
		public int cueball_spawn_weight = 15;
		public int cueball_min_group = 1;
		public int cueball_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> prowler_biomes = Arrays.asList("#nether");
		public int prowler_spawn_weight = 15;
		public int prowler_min_group = 1;
		public int prowler_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> impstone_biomes = Arrays.asList("#nether");
		public int impstone_spawn_weight = 15;
		public int impstone_min_group = 1;
		public int impstone_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> gorenest_biomes = Arrays.asList("#nether");
		public int gorenest_spawn_weight = 4;
		public int gorenest_min_group = 1;
		public int gorenest_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> tentacle_biomes = Arrays.asList("#nether");
		public int tentacle_spawn_weight = 4;
		public int tentacle_min_group = 1;
		public int tentacle_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> spider_mastermind_biomes = Arrays.asList("#nether");
		public int spider_mastermind_spawn_weight = 4;
		public int spider_mastermind_min_group = 1;
		public int spider_mastermind_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> whiplash_biomes = Arrays.asList("#nether");
		public int whiplash_spawn_weight = 4;
		public int whiplash_min_group = 1;
		public int whiplash_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> doomhunter_biomes = Arrays.asList("#nether");
		public int doomhunter_spawn_weight = 4;
		public int doomhunter_min_group = 1;
		public int doomhunter_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> possessed_worker_biomes = Arrays.asList("#nether");
		public int possessed_worker_spawn_weight = 15;
		public int possessed_worker_min_group = 1;
		public int possessed_worker_max_group = 4;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> armoredbaron_biomes = Arrays.asList("#nether");
		public int armoredbaron_spawn_weight = 4;
		public int armoredbaron_min_group = 1;
		public int armoredbaron_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> summoner_biomes = Arrays.asList("#nether");
		public int summoner_spawn_weight = 4;
		public int summoner_min_group = 1;
		public int summoner_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> motherdemon_biomes = Arrays.asList("");
		public int motherdemon_spawn_weight = 1;
		public int motherdemon_min_group = 1;
		public int motherdemon_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> maykrdrone_biomes = Arrays.asList("minecraft:small_end_islands", "minecraft:end_midlands",
				"minecraft:end_barrens", "minecraft:end_highlands");
		public int maykrdrone_spawn_weight = 15;
		public int maykrdrone_min_group = 1;
		public int maykrdrone_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> bloodmaykr_biomes = Arrays.asList("minecraft:small_end_islands", "minecraft:end_midlands",
				"minecraft:end_barrens", "minecraft:end_highlands");
		public int bloodmaykr_spawn_weight = 6;
		public int bloodmaykr_min_group = 1;
		public int bloodmaykr_max_group = 2;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> archmaykr_biomes = Arrays.asList("");
		public int archmaykr_spawn_weight = 1;
		public int archmaykr_min_group = 1;
		public int archmaykr_max_group = 1;

		@ConfigEntry.Gui.Tooltip(count = 1)
		public List<String> gladiator_biomes = Arrays.asList("");
		public int gladiator_spawn_weight = 1;
		public int gladiator_min_group = 1;
		public int gladiator_max_group = 1;
	}

	public static class MobStats {

		public double motherdemon_health = 500;
		public float motherdemon_ranged_damage = 14;

		public double cueball_health = 1;

		public double tentacle_health = 5;
		public float tentacle_melee_damage = 1;

		public double turret_health = 5;
		public float turret_ranged_damage = 6;

		public double icon_health = 1000;
		public float icon_melee_damage = 7;
		public List<String> icon_wave_entries = Arrays.asList("doom:gladiator", "doom:mancubus", "doom:mancubus",
				"doom:marauder", "doom:marauder", "doom:firebronebaron", "doom:baron2016", "doom:baron2016",
				"doom:baron2016", "doom:baron2016", "doom:whiplash", "doom:whiplash", "doom:whiplash", "doom:whiplash",
				"doom:whiplash", "doom:gargoyle", "doom:gargoyle", "doom:gargoyle", "doom:gargoyle", "doom:gargoyle",
				"doom:gargoyle", "doom:gargoyle", "doom:gargoyle", "doom:gargoyle", "doom:gargoyle", "doom:cacodemon",
				"doom:cacodemon", "doom:cacodemon", "doom:cacodemon", "doom:cacodemon", "doom:cacodemon",
				"doom:cacodemon", "doom:cacodemon", "doom:cacodemon", "doom:cacodemon", "doom:painelemental",
				"doom:painelemental", "doom:painelemental", "doom:painelemental", "doom:painelemental",
				"doom:painelemental", "doom:painelemental", "doom:painelemental", "doom:painelemental",
				"doom:painelemental", "doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:imp",
				"doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:prowler", "doom:prowler", "doom:prowler",
				"doom:prowler", "doom:prowler", "doom:prowler", "doom:prowler", "doom:prowler", "doom:prowler",
				"doom:prowler", "doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:imp",
				"doom:imp", "doom:imp", "doom:imp", "doom:imp", "doom:pinky", "doom:pinky", "doom:pinky", "doom:pinky",
				"doom:pinky", "doom:pinky", "doom:pinky", "doom:pinky", "doom:pinky", "doom:pinky", "doom:lost_soul",
				"doom:lost_soul", "doom:lost_soul", "doom:lost_soul", "doom:lost_soul", "doom:lost_soul",
				"doom:lost_soul", "doom:lost_soul", "doom:lost_soul", "doom:lost_soul");

		public double imp_health = 30;
		public float imp_ranged_damage = 4;

		public double pinky_health = 75;
		public double pinky_melee_damage = 3;

		public double spectre_health = 75;
		public double spectre_melee_damage = 3;

		public double lost_soul_health = 10;
		public double lost_soul_melee_damage = 1;

		public double cacodemon_health = 80;
		public float cacodemon_ranged_damage = 5;

		public double archvile_health = 100;
		public float archvile_ranged_damage = 5;

		public double summoner_health = 100;
		public float summoner_ranged_damage = 3;

		public double prowler_health = 15;
		public float prowler_ranged_damage = 4;
		public double prowler_melee_damage = 4;

		public double maykrdrone_health = 20;
		public float maykrdrone_ranged_damage = 2;

		public double bloodmaykr_health = 45;
		public float bloodmaykr_ranged_damage = 5;

		public double archmaykr_health = 400;
		public float archmaykr_ranged_damage = 14;

		public double baron_health = 180;
		public float baron_ranged_damage = 6;
		public double baron_melee_damage = 7;

		public double gladiator_health = 240;
		public float gladiator_ranged_damage = 6;
		public double gladiator_melee_damage = 7;

		public double mancubus_health = 80;
		public double mancubus_melee_damage = 4;
		public float mancubus_ranged_damage = 6;

		public double revenant_health = 45;
		public float revenant_ranged_damage = 5;

		public double spider_mastermind_health = 300;
		public float spider_mastermind_ranged_damage = 7;
		public double spider_mastermind_melee_damage = 4;

		public double zombieman_health = 15;

		public double arachnotron_health = 30;
		public float arachnotron_ranged_damage = 5;

		public double impstone_health = 15;
		public double impstone_melee_damage = 2;

		public double gargoyle_health = 30;
		public float gargoyle_ranged_damage = 5;
		public double gargoyle_melee_damage = 2;

		public double chaingunner_health = 15;

		public double shotgunguy_health = 15;

		public double marauder_health = 300;
		public double marauder_axe_damage = 6;
		public float marauder_ssgdamage = 10.5F;

		public double pain_health = 80;

		public double hellknight_health = 90;
		public float hellknight_ranged_damage = 6;
		public double hellknight_melee_damage = 4;

		public double hellknight2016_health = 90;
		public double hellknight2016_melee_damage = 4;

		public double cyberdemon_health = 300;
		public float cyberdemon_ranged_damage = 9;
		public double cyberdemon_melee_damage = 7;

		public double doomhunter_health = 150;
		public float doomhunter_ranged_damage = 7;
		public double doomhunter_melee_damage = 5;

		public double whiplash_health = 90;
		public double whiplash_melee_damage = 4;

		public double armoredbaron_health = 240;
		public double armoredbaron_melee_damage = 7;

		public double unwilling_health = 15;
		public double unwilling_melee_damage = 2;

		public double possessed_scientist_health = 15;
		public double possessed_scientist_melee_damage = 2;

		public double possessed_soldier_health = 15;
		public float possessed_soldier_ranged_damage = 2;

		public double mechazombie_health = 25;
		public float mechazombie_ranged_damage = 3;

		public double gorenest_health = 5;
	}
}