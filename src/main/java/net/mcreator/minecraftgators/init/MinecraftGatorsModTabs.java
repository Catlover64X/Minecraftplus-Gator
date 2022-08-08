
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecraftGatorsModTabs {
	public static CreativeModeTab TAB_MINECRAFTPLUS_GATOR;

	public static void load() {
		TAB_MINECRAFTPLUS_GATOR = new CreativeModeTab("tabminecraftplus_gator") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecraftGatorsModItems.BETTERITE_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
