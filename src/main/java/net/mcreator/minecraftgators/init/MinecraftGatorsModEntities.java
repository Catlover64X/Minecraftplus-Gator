
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftgators.entity.StormFollowerEntity;
import net.mcreator.minecraftgators.entity.CatGunEntity;
import net.mcreator.minecraftgators.entity.BlazeKingEntityProjectile;
import net.mcreator.minecraftgators.entity.BlazeKingEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<BlazeKingEntity> BLAZE_KING = register("blaze_king",
			EntityType.Builder.<BlazeKingEntity>of(BlazeKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlazeKingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<BlazeKingEntityProjectile> BLAZE_KING_PROJECTILE = register("entitybulletblaze_king",
			EntityType.Builder.<BlazeKingEntityProjectile>of(BlazeKingEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BlazeKingEntityProjectile::new).sized(0.5f, 0.5f));
	public static final EntityType<CatGunEntity> CAT_GUN = register("entitybulletcat_gun",
			EntityType.Builder.<CatGunEntity>of(CatGunEntity::new, MobCategory.MISC).setCustomClientFactory(CatGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<StormFollowerEntity> STORM_FOLLOWER = register("storm_follower",
			EntityType.Builder.<StormFollowerEntity>of(StormFollowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(999).setUpdateInterval(3).setCustomClientFactory(StormFollowerEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlazeKingEntity.init();
			StormFollowerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLAZE_KING, BlazeKingEntity.createAttributes().build());
		event.put(STORM_FOLLOWER, StormFollowerEntity.createAttributes().build());
	}
}
