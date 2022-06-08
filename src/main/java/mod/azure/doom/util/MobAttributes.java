package mod.azure.doom.util;

import mod.azure.doom.entity.tierambient.CueBallEntity;
import mod.azure.doom.entity.tierambient.GoreNestEntity;
import mod.azure.doom.entity.tierambient.TentacleEntity;
import mod.azure.doom.entity.tierambient.TurretEntity;
import mod.azure.doom.entity.tierboss.ArchMakyrEntity;
import mod.azure.doom.entity.tierboss.GladiatorEntity;
import mod.azure.doom.entity.tierboss.IconofsinEntity;
import mod.azure.doom.entity.tierboss.MotherDemonEntity;
import mod.azure.doom.entity.tierboss.SpiderMastermind2016Entity;
import mod.azure.doom.entity.tierboss.SpiderMastermindEntity;
import mod.azure.doom.entity.tierfodder.ChaingunnerEntity;
import mod.azure.doom.entity.tierfodder.GargoyleEntity;
import mod.azure.doom.entity.tierfodder.ImpEntity;
import mod.azure.doom.entity.tierfodder.ImpStoneEntity;
import mod.azure.doom.entity.tierfodder.LostSoulEntity;
import mod.azure.doom.entity.tierfodder.MaykrDroneEntity;
import mod.azure.doom.entity.tierfodder.MechaZombieEntity;
import mod.azure.doom.entity.tierfodder.PossessedScientistEntity;
import mod.azure.doom.entity.tierfodder.PossessedSoldierEntity;
import mod.azure.doom.entity.tierfodder.ShotgunguyEntity;
import mod.azure.doom.entity.tierfodder.UnwillingEntity;
import mod.azure.doom.entity.tierfodder.ZombiemanEntity;
import mod.azure.doom.entity.tierheavy.ArachnotronEntity;
import mod.azure.doom.entity.tierheavy.BloodMaykrEntity;
import mod.azure.doom.entity.tierheavy.CacodemonEntity;
import mod.azure.doom.entity.tierheavy.Hellknight2016Entity;
import mod.azure.doom.entity.tierheavy.HellknightEntity;
import mod.azure.doom.entity.tierheavy.MancubusEntity;
import mod.azure.doom.entity.tierheavy.PainEntity;
import mod.azure.doom.entity.tierheavy.PinkyEntity;
import mod.azure.doom.entity.tierheavy.ProwlerEntity;
import mod.azure.doom.entity.tierheavy.Revenant2016Entity;
import mod.azure.doom.entity.tierheavy.RevenantEntity;
import mod.azure.doom.entity.tierheavy.SpectreEntity;
import mod.azure.doom.entity.tierheavy.WhiplashEntity;
import mod.azure.doom.entity.tiersuperheavy.ArchvileEntity;
import mod.azure.doom.entity.tiersuperheavy.ArmoredBaronEntity;
import mod.azure.doom.entity.tiersuperheavy.BaronEntity;
import mod.azure.doom.entity.tiersuperheavy.CyberdemonEntity;
import mod.azure.doom.entity.tiersuperheavy.DoomHunterEntity;
import mod.azure.doom.entity.tiersuperheavy.FireBaronEntity;
import mod.azure.doom.entity.tiersuperheavy.MarauderEntity;
import mod.azure.doom.entity.tiersuperheavy.SummonerEntity;
import mod.azure.doom.util.registry.DoomEntities;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MobAttributes {

	public static void init() {
		FabricDefaultAttributeRegistry.register(DoomEntities.GLADIATOR, GladiatorEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ARCHVILE, ArchvileEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.BARON, BaronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.CACODEMON, CacodemonEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.CHAINGUNNER, ChaingunnerEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.CYBERDEMON, CyberdemonEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.HELLKNIGHT, HellknightEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.HELLKNIGHT2016,
				Hellknight2016Entity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ICONOFSIN, IconofsinEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.IMP, ImpEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.IMP_STONE, ImpStoneEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ARACHNOTRON, ArachnotronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.LOST_SOUL, LostSoulEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.LOST_SOUL_ETERNAL, LostSoulEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.MANCUBUS, MancubusEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.MARAUDER, MarauderEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.PAIN, PainEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.PINKY, PinkyEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.SPECTRE, SpectreEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.POSSESSEDSCIENTIST,
				PossessedScientistEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.POSSESSEDSOLDIER,
				PossessedSoldierEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.MECHAZOMBIE, MechaZombieEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.REVENANT, RevenantEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.SHOTGUNGUY, ShotgunguyEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.SPIDERMASTERMIND,
				SpiderMastermindEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.UNWILLING, UnwillingEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ZOMBIEMAN, ZombiemanEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.GORE_NEST, GoreNestEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.GARGOYLE, GargoyleEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.CUEBALL, CueBallEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.PROWLER, ProwlerEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.DREADKNIGHT, Hellknight2016Entity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.POSSESSEDWORKER,
				PossessedScientistEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.DOOMHUNTER, DoomHunterEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.WHIPLASH, WhiplashEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.BARON2016, BaronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ARMORBARON, ArmoredBaronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ARACHNOTRONETERNAL,
				ArachnotronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.MAYKRDRONE, MaykrDroneEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.SPIDERMASTERMIND2016,
				SpiderMastermind2016Entity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.BLOODMAYKR, BloodMaykrEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.ARCHMAKER, ArchMakyrEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.FIREBARON, FireBaronEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.TENTACLE, TentacleEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.MOTHERDEMON, MotherDemonEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.TURRET, TurretEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.SUMMONER, SummonerEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DoomEntities.REVENANT2016, Revenant2016Entity.createMobAttributes());
	}
}