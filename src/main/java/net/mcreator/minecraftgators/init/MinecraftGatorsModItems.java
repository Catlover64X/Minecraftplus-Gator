
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftgators.item.UnrefinedCatNipItem;
import net.mcreator.minecraftgators.item.TestItem;
import net.mcreator.minecraftgators.item.StormFollowerMiniCrossbowItem;
import net.mcreator.minecraftgators.item.RubyItem;
<<<<<<< HEAD
=======
import net.mcreator.minecraftgators.item.RATSItem;
>>>>>>> branch 'master' of https://github.com/Catlover64X/Minecraftplus-Gator.git
import net.mcreator.minecraftgators.item.LitterBoxItem;
import net.mcreator.minecraftgators.item.Emerald_ForgedArmorItem;
import net.mcreator.minecraftgators.item.DiscItem;
import net.mcreator.minecraftgators.item.CookedRottenFleshItem;
import net.mcreator.minecraftgators.item.CatrealmsfluidItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustSwordItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustShovelItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustPickaxeItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustHoeItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustDustItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustAxeItem;
import net.mcreator.minecraftgators.item.Cat_Jesus_DustArmorItem;
import net.mcreator.minecraftgators.item.CatRealmsItem;
import net.mcreator.minecraftgators.item.CatNipFood2Item;
import net.mcreator.minecraftgators.item.CatGunItem;
import net.mcreator.minecraftgators.item.CatFoodItem;
import net.mcreator.minecraftgators.item.CatCoalItemItem;
import net.mcreator.minecraftgators.item.BetteriteSwordItem;
import net.mcreator.minecraftgators.item.BetteriteShovelItem;
import net.mcreator.minecraftgators.item.BetteritePickaxeItem;
import net.mcreator.minecraftgators.item.BetteriteIngotItem;
import net.mcreator.minecraftgators.item.BetteriteHoeItem;
import net.mcreator.minecraftgators.item.BetteriteAxeItem;
import net.mcreator.minecraftgators.item.BetteriteArmorItem;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

public class MinecraftGatorsModItems {
<<<<<<< HEAD
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftGatorsMod.MODID);
	public static final RegistryObject<Item> EMERALD_FORGED_ARMOR_HELMET = REGISTRY.register("emerald_forged_armor_helmet",
			() -> new Emerald_ForgedArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_FORGED_ARMOR_CHESTPLATE = REGISTRY.register("emerald_forged_armor_chestplate",
			() -> new Emerald_ForgedArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_FORGED_ARMOR_LEGGINGS = REGISTRY.register("emerald_forged_armor_leggings",
			() -> new Emerald_ForgedArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_FORGED_ARMOR_BOOTS = REGISTRY.register("emerald_forged_armor_boots",
			() -> new Emerald_ForgedArmorItem.Boots());
	public static final RegistryObject<Item> CAT_FOOD_BLOCK = block(MinecraftGatorsModBlocks.CAT_FOOD_BLOCK,
=======
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMERALD_FORGED_ARMOR_HELMET = register(new Emerald_ForgedArmorItem.Helmet());
	public static final Item EMERALD_FORGED_ARMOR_CHESTPLATE = register(new Emerald_ForgedArmorItem.Chestplate());
	public static final Item EMERALD_FORGED_ARMOR_LEGGINGS = register(new Emerald_ForgedArmorItem.Leggings());
	public static final Item EMERALD_FORGED_ARMOR_BOOTS = register(new Emerald_ForgedArmorItem.Boots());
	public static final Item CAT_FOOD = register(new CatFoodItem());
	public static final Item CAT_FOOD_BLOCK = register(MinecraftGatorsModBlocks.CAT_FOOD_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_LOG = register(MinecraftGatorsModBlocks.CAT_LOG_Y_LOG, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_PLANKS = register(MinecraftGatorsModBlocks.CAT_LOG_Y_PLANKS, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_LEAVES = register(MinecraftGatorsModBlocks.CAT_LOG_Y_LEAVES, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_STAIRS = register(MinecraftGatorsModBlocks.CAT_LOG_Y_STAIRS, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_SLAB = register(MinecraftGatorsModBlocks.CAT_LOG_Y_SLAB, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_FENCE = register(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_FENCE_GATE = register(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE_GATE,
>>>>>>> branch 'master' of https://github.com/Catlover64X/Minecraftplus-Gator.git
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_LOG = block(MinecraftGatorsModBlocks.CAT_LOG_Y_LOG,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_PLANKS = block(MinecraftGatorsModBlocks.CAT_LOG_Y_PLANKS,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_LEAVES = block(MinecraftGatorsModBlocks.CAT_LOG_Y_LEAVES,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_STAIRS = block(MinecraftGatorsModBlocks.CAT_LOG_Y_STAIRS,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_SLAB = block(MinecraftGatorsModBlocks.CAT_LOG_Y_SLAB,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
<<<<<<< HEAD
	public static final RegistryObject<Item> CAT_LOG_Y_FENCE = block(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_FENCE_GATE = block(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE_GATE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_PRESSURE_PLATE = block(MinecraftGatorsModBlocks.CAT_LOG_Y_PRESSURE_PLATE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_LOG_Y_BUTTON = block(MinecraftGatorsModBlocks.CAT_LOG_Y_BUTTON,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> BLAZE_KING = REGISTRY.register("blaze_king_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftGatorsModEntities.BLAZE_KING, -39424, -26266,
					new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR)));
	public static final RegistryObject<Item> BLAZEKINGSBLADE = REGISTRY.register("blazekingsblade", () -> new TestItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(MinecraftGatorsModBlocks.RUBY_ORE, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> RUBY_BLOCK = block(MinecraftGatorsModBlocks.RUBY_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> BETTERITE_INGOT = REGISTRY.register("betterite_ingot", () -> new BetteriteIngotItem());
	public static final RegistryObject<Item> BETTERITE_ARMOR_HELMET = REGISTRY.register("betterite_armor_helmet",
			() -> new BetteriteArmorItem.Helmet());
	public static final RegistryObject<Item> BETTERITE_ARMOR_CHESTPLATE = REGISTRY.register("betterite_armor_chestplate",
			() -> new BetteriteArmorItem.Chestplate());
	public static final RegistryObject<Item> BETTERITE_ARMOR_LEGGINGS = REGISTRY.register("betterite_armor_leggings",
			() -> new BetteriteArmorItem.Leggings());
	public static final RegistryObject<Item> BETTERITE_ARMOR_BOOTS = REGISTRY.register("betterite_armor_boots", () -> new BetteriteArmorItem.Boots());
	public static final RegistryObject<Item> BETTERITE_PICKAXE = REGISTRY.register("betterite_pickaxe", () -> new BetteritePickaxeItem());
	public static final RegistryObject<Item> BETTERITE_AXE = REGISTRY.register("betterite_axe", () -> new BetteriteAxeItem());
	public static final RegistryObject<Item> BETTERITE_SWORD = REGISTRY.register("betterite_sword", () -> new BetteriteSwordItem());
	public static final RegistryObject<Item> BETTERITE_SHOVEL = REGISTRY.register("betterite_shovel", () -> new BetteriteShovelItem());
	public static final RegistryObject<Item> BETTERITE_HOE = REGISTRY.register("betterite_hoe", () -> new BetteriteHoeItem());
	public static final RegistryObject<Item> CAT_LITTER = block(MinecraftGatorsModBlocks.CAT_LITTER, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> DUST_BLOCK = block(MinecraftGatorsModBlocks.DUST_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_NIP_PLANT = block(MinecraftGatorsModBlocks.CAT_NIP_PLANT,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> UNREFINED_CAT_NIP = REGISTRY.register("unrefined_cat_nip", () -> new UnrefinedCatNipItem());
	public static final RegistryObject<Item> COMPACTED_CAT_LITTER = block(MinecraftGatorsModBlocks.COMPACTED_CAT_LITTER,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> LITTER_BOX = REGISTRY.register("litter_box", () -> new LitterBoxItem());
	public static final RegistryObject<Item> CAT_ALTER_BLOCK = block(MinecraftGatorsModBlocks.CAT_ALTER_BLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_JESUS_DUST_DUST = REGISTRY.register("cat_jesus_dust_dust", () -> new Cat_Jesus_DustDustItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_ORE = block(MinecraftGatorsModBlocks.CAT_JESUS_DUST_ORE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_JESUS_DUST_BLOCK = block(MinecraftGatorsModBlocks.CAT_JESUS_DUST_BLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_JESUS_DUST_PICKAXE = REGISTRY.register("cat_jesus_dust_pickaxe",
			() -> new Cat_Jesus_DustPickaxeItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_AXE = REGISTRY.register("cat_jesus_dust_axe", () -> new Cat_Jesus_DustAxeItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_SWORD = REGISTRY.register("cat_jesus_dust_sword", () -> new Cat_Jesus_DustSwordItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_SHOVEL = REGISTRY.register("cat_jesus_dust_shovel", () -> new Cat_Jesus_DustShovelItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_HOE = REGISTRY.register("cat_jesus_dust_hoe", () -> new Cat_Jesus_DustHoeItem());
	public static final RegistryObject<Item> CAT_JESUS_DUST_ARMOR_HELMET = REGISTRY.register("cat_jesus_dust_armor_helmet",
			() -> new Cat_Jesus_DustArmorItem.Helmet());
	public static final RegistryObject<Item> CAT_JESUS_DUST_ARMOR_CHESTPLATE = REGISTRY.register("cat_jesus_dust_armor_chestplate",
			() -> new Cat_Jesus_DustArmorItem.Chestplate());
	public static final RegistryObject<Item> CAT_JESUS_DUST_ARMOR_LEGGINGS = REGISTRY.register("cat_jesus_dust_armor_leggings",
			() -> new Cat_Jesus_DustArmorItem.Leggings());
	public static final RegistryObject<Item> CAT_JESUS_DUST_ARMOR_BOOTS = REGISTRY.register("cat_jesus_dust_armor_boots",
			() -> new Cat_Jesus_DustArmorItem.Boots());
	public static final RegistryObject<Item> INFECTED_CATALYST = block(MinecraftGatorsModBlocks.INFECTED_CATALYST,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> COMPRESSEDCATJESUSBLOCK = block(MinecraftGatorsModBlocks.COMPRESSEDCATJESUSBLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_REALMS = REGISTRY.register("cat_realms", () -> new CatRealmsItem());
	public static final RegistryObject<Item> STORM_FOLLOWER = REGISTRY.register("storm_follower_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftGatorsModEntities.STORM_FOLLOWER, -16777063, -16777216,
					new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR)));
	public static final RegistryObject<Item> DISC = REGISTRY.register("disc", () -> new DiscItem());
	public static final RegistryObject<Item> CAT_DIRT = block(MinecraftGatorsModBlocks.CAT_DIRT, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_GUN = REGISTRY.register("cat_gun", () -> new CatGunItem());
	public static final RegistryObject<Item> CAT_POOP = block(MinecraftGatorsModBlocks.CAT_POOP, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_FOOD = REGISTRY.register("cat_food", () -> new CatFoodItem());
	public static final RegistryObject<Item> CAT_NIP_FOOD_2 = REGISTRY.register("cat_nip_food_2", () -> new CatNipFood2Item());
	public static final RegistryObject<Item> COOKED_ROTTEN_FLESH = REGISTRY.register("cooked_rotten_flesh", () -> new CookedRottenFleshItem());
	public static final RegistryObject<Item> WET_CAT_LITTER = block(MinecraftGatorsModBlocks.WET_CAT_LITTER,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CATREALMSFLUID_BUCKET = REGISTRY.register("catrealmsfluid_bucket", () -> new CatrealmsfluidItem());
	public static final RegistryObject<Item> CAT_COAL_BLOCK = block(MinecraftGatorsModBlocks.CAT_COAL_BLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_COAL_ITEM = REGISTRY.register("cat_coal_item", () -> new CatCoalItemItem());
	public static final RegistryObject<Item> CAT_STONE = block(MinecraftGatorsModBlocks.CAT_STONE, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> CAT_COAL_ORE = block(MinecraftGatorsModBlocks.CAT_COAL_ORE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final RegistryObject<Item> STORM_FOLLOWER_MINI_CROSSBOW = REGISTRY.register("storm_follower_mini_crossbow",
			() -> new StormFollowerMiniCrossbowItem());
=======
	public static final Item CAT_REALMS = register(new CatRealmsItem());
	public static final Item STORM_FOLLOWER = register(new SpawnEggItem(MinecraftGatorsModEntities.STORM_FOLLOWER, -16777063, -16777216,
			new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR)).setRegistryName("storm_follower_spawn_egg"));
	public static final Item DISC = register(new DiscItem());
	public static final Item CAT_DIRT = register(MinecraftGatorsModBlocks.CAT_DIRT, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item COOKED_ROTTEN_FLESH = register(new CookedRottenFleshItem());
	public static final Item CAT_GUN = register(new CatGunItem());
	public static final Item CAT_SHIT = register(MinecraftGatorsModBlocks.CAT_SHIT, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item RATS = register(new RATSItem());
>>>>>>> branch 'master' of https://github.com/Catlover64X/Minecraftplus-Gator.git

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
