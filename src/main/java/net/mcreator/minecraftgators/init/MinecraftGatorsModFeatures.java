
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.minecraftgators.world.features.ores.RubyOreFeature;
import net.mcreator.minecraftgators.world.features.ores.Cat_Jesus_DustOreFeature;
import net.mcreator.minecraftgators.world.features.ores.CatNipPlantFeature;
import net.mcreator.minecraftgators.world.features.ores.CatLog_yLogFeature;
import net.mcreator.minecraftgators.world.features.ores.CatFoodBlockFeature;
import net.mcreator.minecraftgators.world.features.ores.CatDirtFeature;
import net.mcreator.minecraftgators.world.features.ores.CatCoalOreFeature;
import net.mcreator.minecraftgators.world.features.StrangetempleFeature;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MinecraftGatorsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MinecraftGatorsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CAT_FOOD_BLOCK = register("cat_food_block", CatFoodBlockFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CatFoodBlockFeature.GENERATE_BIOMES, CatFoodBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAT_LOG_Y_LOG = register("cat_log_y_log", CatLog_yLogFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CatLog_yLogFeature.GENERATE_BIOMES, CatLog_yLogFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAT_NIP_PLANT = register("cat_nip_plant", CatNipPlantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CatNipPlantFeature.GENERATE_BIOMES, CatNipPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAT_JESUS_DUST_ORE = register("cat_jesus_dust_ore", Cat_Jesus_DustOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Cat_Jesus_DustOreFeature.GENERATE_BIOMES,
					Cat_Jesus_DustOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAT_DIRT = register("cat_dirt", CatDirtFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CatDirtFeature.GENERATE_BIOMES, CatDirtFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STRANGETEMPLE = register("strangetemple", StrangetempleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, StrangetempleFeature.GENERATE_BIOMES, StrangetempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAT_COAL_ORE = register("cat_coal_ore", CatCoalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CatCoalOreFeature.GENERATE_BIOMES, CatCoalOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
