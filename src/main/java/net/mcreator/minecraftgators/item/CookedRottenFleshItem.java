
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class CookedRottenFleshItem extends Item {
	public CookedRottenFleshItem() {
		super(new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(1f)

						.meat().build()));
		setRegistryName("cooked_rotten_flesh");
	}
}
