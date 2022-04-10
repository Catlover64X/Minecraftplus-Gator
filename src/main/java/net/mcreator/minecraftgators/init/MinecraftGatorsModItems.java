
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftgators.item.UnrefinedCatNipItem;
import net.mcreator.minecraftgators.item.TestItem;
import net.mcreator.minecraftgators.item.RubyItem;
import net.mcreator.minecraftgators.item.RatsItem;
import net.mcreator.minecraftgators.item.LitterBoxItem;
import net.mcreator.minecraftgators.item.Emerald_ForgedArmorItem;
import net.mcreator.minecraftgators.item.DiscItem;
import net.mcreator.minecraftgators.item.CookedRottenFleshItem;
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
import net.mcreator.minecraftgators.item.BetteriteSwordItem;
import net.mcreator.minecraftgators.item.BetteriteShovelItem;
import net.mcreator.minecraftgators.item.BetteritePickaxeItem;
import net.mcreator.minecraftgators.item.BetteriteIngotItem;
import net.mcreator.minecraftgators.item.BetteriteHoeItem;
import net.mcreator.minecraftgators.item.BetteriteAxeItem;
import net.mcreator.minecraftgators.item.BetteriteArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMERALD_FORGED_ARMOR_HELMET = register(new Emerald_ForgedArmorItem.Helmet());
	public static final Item EMERALD_FORGED_ARMOR_CHESTPLATE = register(new Emerald_ForgedArmorItem.Chestplate());
	public static final Item EMERALD_FORGED_ARMOR_LEGGINGS = register(new Emerald_ForgedArmorItem.Leggings());
	public static final Item EMERALD_FORGED_ARMOR_BOOTS = register(new Emerald_ForgedArmorItem.Boots());
	public static final Item RATS = register(new RatsItem());
	public static final Item CAT_FOOD = register(new CatFoodItem());
	public static final Item CAT_FOOD_BLOCK = register(MinecraftGatorsModBlocks.CAT_FOOD_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_LOG = register(MinecraftGatorsModBlocks.CAT_LOG_Y_LOG, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_PLANKS = register(MinecraftGatorsModBlocks.CAT_LOG_Y_PLANKS, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_LEAVES = register(MinecraftGatorsModBlocks.CAT_LOG_Y_LEAVES, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_STAIRS = register(MinecraftGatorsModBlocks.CAT_LOG_Y_STAIRS, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_SLAB = register(MinecraftGatorsModBlocks.CAT_LOG_Y_SLAB, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_FENCE = register(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_FENCE_GATE = register(MinecraftGatorsModBlocks.CAT_LOG_Y_FENCE_GATE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_PRESSURE_PLATE = register(MinecraftGatorsModBlocks.CAT_LOG_Y_PRESSURE_PLATE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_LOG_Y_BUTTON = register(MinecraftGatorsModBlocks.CAT_LOG_Y_BUTTON, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item BLAZE_KING = register(new SpawnEggItem(MinecraftGatorsModEntities.BLAZE_KING, -39424, -26266,
			new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR)).setRegistryName("blaze_king_spawn_egg"));
	public static final Item BLAZEKINGSBLADE = register(new TestItem());
	public static final Item RUBY = register(new RubyItem());
	public static final Item RUBY_ORE = register(MinecraftGatorsModBlocks.RUBY_ORE, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item RUBY_BLOCK = register(MinecraftGatorsModBlocks.RUBY_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item BETTERITE_INGOT = register(new BetteriteIngotItem());
	public static final Item BETTERITE_ARMOR_HELMET = register(new BetteriteArmorItem.Helmet());
	public static final Item BETTERITE_ARMOR_CHESTPLATE = register(new BetteriteArmorItem.Chestplate());
	public static final Item BETTERITE_ARMOR_LEGGINGS = register(new BetteriteArmorItem.Leggings());
	public static final Item BETTERITE_ARMOR_BOOTS = register(new BetteriteArmorItem.Boots());
	public static final Item BETTERITE_PICKAXE = register(new BetteritePickaxeItem());
	public static final Item BETTERITE_AXE = register(new BetteriteAxeItem());
	public static final Item BETTERITE_SWORD = register(new BetteriteSwordItem());
	public static final Item BETTERITE_SHOVEL = register(new BetteriteShovelItem());
	public static final Item BETTERITE_HOE = register(new BetteriteHoeItem());
	public static final Item CAT_LITTER = register(MinecraftGatorsModBlocks.CAT_LITTER, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item DUST_BLOCK = register(MinecraftGatorsModBlocks.DUST_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_NIP_PLANT = register(MinecraftGatorsModBlocks.CAT_NIP_PLANT, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item UNREFINED_CAT_NIP = register(new UnrefinedCatNipItem());
	public static final Item CAT_NIP_FOOD_2 = register(new CatNipFood2Item());
	public static final Item COMPACTED_CAT_LITTER = register(MinecraftGatorsModBlocks.COMPACTED_CAT_LITTER,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item LITTER_BOX = register(new LitterBoxItem());
	public static final Item CAT_ALTER_BLOCK = register(MinecraftGatorsModBlocks.CAT_ALTER_BLOCK, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_JESUS_DUST_DUST = register(new Cat_Jesus_DustDustItem());
	public static final Item CAT_JESUS_DUST_ORE = register(MinecraftGatorsModBlocks.CAT_JESUS_DUST_ORE,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_JESUS_DUST_BLOCK = register(MinecraftGatorsModBlocks.CAT_JESUS_DUST_BLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_JESUS_DUST_PICKAXE = register(new Cat_Jesus_DustPickaxeItem());
	public static final Item CAT_JESUS_DUST_AXE = register(new Cat_Jesus_DustAxeItem());
	public static final Item CAT_JESUS_DUST_SWORD = register(new Cat_Jesus_DustSwordItem());
	public static final Item CAT_JESUS_DUST_SHOVEL = register(new Cat_Jesus_DustShovelItem());
	public static final Item CAT_JESUS_DUST_HOE = register(new Cat_Jesus_DustHoeItem());
	public static final Item CAT_JESUS_DUST_ARMOR_HELMET = register(new Cat_Jesus_DustArmorItem.Helmet());
	public static final Item CAT_JESUS_DUST_ARMOR_CHESTPLATE = register(new Cat_Jesus_DustArmorItem.Chestplate());
	public static final Item CAT_JESUS_DUST_ARMOR_LEGGINGS = register(new Cat_Jesus_DustArmorItem.Leggings());
	public static final Item CAT_JESUS_DUST_ARMOR_BOOTS = register(new Cat_Jesus_DustArmorItem.Boots());
	public static final Item INFECTED_CATALYST = register(MinecraftGatorsModBlocks.INFECTED_CATALYST, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_GUN = register(new CatGunItem());
	public static final Item COMPRESSEDCATJESUSBLOCK = register(MinecraftGatorsModBlocks.COMPRESSEDCATJESUSBLOCK,
			MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item CAT_REALMS = register(new CatRealmsItem());
	public static final Item STORM_FOLLOWER = register(new SpawnEggItem(MinecraftGatorsModEntities.STORM_FOLLOWER, -16777063, -16777216,
			new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR)).setRegistryName("storm_follower_spawn_egg"));
	public static final Item DISC = register(new DiscItem());
	public static final Item CAT_DIRT = register(MinecraftGatorsModBlocks.CAT_DIRT, MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR);
	public static final Item COOKED_ROTTEN_FLESH = register(new CookedRottenFleshItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
