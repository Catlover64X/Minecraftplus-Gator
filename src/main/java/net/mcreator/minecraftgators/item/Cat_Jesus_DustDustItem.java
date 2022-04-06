
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class Cat_Jesus_DustDustItem extends Item {
	public Cat_Jesus_DustDustItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cat_jesus_dust_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
