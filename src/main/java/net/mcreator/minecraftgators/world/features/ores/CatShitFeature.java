
package net.mcreator.minecraftgators.world.features.ores;

public class CatShitFeature extends OreFeature {

	public static final CatShitFeature FEATURE = (CatShitFeature) new CatShitFeature().setRegistryName("minecraft_gators:cat_shit");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(CatShitFeatureRuleTest.INSTANCE, MinecraftGatorsModBlocks.CAT_SHIT.defaultBlockState(), 16))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("minecraft_gators:cat_desert"));

	public CatShitFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_gators:cat_realms")))
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class CatShitFeatureRuleTest extends RuleTest {

		static final CatShitFeatureRuleTest INSTANCE = new CatShitFeatureRuleTest();
		static final com.mojang.serialization.Codec<CatShitFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<CatShitFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("minecraft_gators:cat_shit_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
