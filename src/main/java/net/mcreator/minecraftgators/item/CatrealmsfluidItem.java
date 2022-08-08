
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModFluids;

public class CatrealmsfluidItem extends BucketItem {
	public CatrealmsfluidItem() {
		super(MinecraftGatorsModFluids.CATREALMSFLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
	}
}
