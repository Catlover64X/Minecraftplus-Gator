
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.minecraftgators.world.features.ores.RubyOreFeature;
import net.mcreator.minecraftgators.world.features.ores.Cat_Jesus_DustOreFeature;
import net.mcreator.minecraftgators.world.features.ores.CatShitFeature;
import net.mcreator.minecraftgators.world.features.ores.CatNipPlantFeature;
import net.mcreator.minecraftgators.world.features.ores.CatLog_yLogFeature;
import net.mcreator.minecraftgators.world.features.ores.CatFoodBlockFeature;
import net.mcreator.minecraftgators.world.features.ores.CatDirtFeature;
import net.mcreator.minecraftgators.world.features.StrangetempleFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(CatFoodBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CatFoodBlockFeature.GENERATE_BIOMES, CatFoodBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CatLog_yLogFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CatLog_yLogFeature.GENERATE_BIOMES, CatLog_yLogFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES,
				RubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CatNipPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CatNipPlantFeature.GENERATE_BIOMES, CatNipPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Cat_Jesus_DustOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				Cat_Jesus_DustOreFeature.GENERATE_BIOMES, Cat_Jesus_DustOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CatDirtFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CatDirtFeature.GENERATE_BIOMES,
				CatDirtFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StrangetempleFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				StrangetempleFeature.GENERATE_BIOMES, StrangetempleFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CatShitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CatShitFeature.GENERATE_BIOMES,
				CatShitFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
