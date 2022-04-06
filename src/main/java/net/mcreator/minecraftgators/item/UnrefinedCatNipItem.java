
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class UnrefinedCatNipItem extends Item {
	public UnrefinedCatNipItem() {
		super(new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(32).rarity(Rarity.COMMON));
		setRegistryName("unrefined_cat_nip");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
