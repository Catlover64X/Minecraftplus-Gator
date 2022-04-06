
package net.mcreator.minecraftgators.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class RatsItem extends RecordItem {
	public RatsItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
				new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("rats");
	}
}
