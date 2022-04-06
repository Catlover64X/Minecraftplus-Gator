
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class BetteriteIngotItem extends Item {
	public BetteriteIngotItem() {
		super(new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(16).rarity(Rarity.RARE));
		setRegistryName("betterite_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
