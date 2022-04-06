
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("ruby");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
