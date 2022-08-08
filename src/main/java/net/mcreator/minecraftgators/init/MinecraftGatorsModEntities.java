
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftgators.entity.StormFollowerMiniCrossbowEntity;
import net.mcreator.minecraftgators.entity.StormFollowerEntity;
import net.mcreator.minecraftgators.entity.BlazeKingEntityProjectile;
import net.mcreator.minecraftgators.entity.BlazeKingEntity;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MinecraftGatorsMod.MODID);
	public static final RegistryObject<EntityType<BlazeKingEntity>> BLAZE_KING = register("blaze_king",
			EntityType.Builder.<BlazeKingEntity>of(BlazeKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlazeKingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlazeKingEntityProjectile>> BLAZE_KING_PROJECTILE = register("projectile_blaze_king",
			EntityType.Builder.<BlazeKingEntityProjectile>of(BlazeKingEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BlazeKingEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StormFollowerEntity>> STORM_FOLLOWER = register("storm_follower",
			EntityType.Builder.<StormFollowerEntity>of(StormFollowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(999).setUpdateInterval(3).setCustomClientFactory(StormFollowerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StormFollowerMiniCrossbowEntity>> STORM_FOLLOWER_MINI_CROSSBOW = register(
			"projectile_storm_follower_mini_crossbow",
			EntityType.Builder.<StormFollowerMiniCrossbowEntity>of(StormFollowerMiniCrossbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(StormFollowerMiniCrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
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
		event.put(BLAZE_KING.get(), BlazeKingEntity.createAttributes().build());
		event.put(STORM_FOLLOWER.get(), StormFollowerEntity.createAttributes().build());
	}
}
