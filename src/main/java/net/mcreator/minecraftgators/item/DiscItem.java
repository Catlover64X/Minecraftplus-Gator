
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModSounds;

public class DiscItem extends RecordItem {
	public DiscItem() {
		super(0, MinecraftGatorsModSounds.REGISTRY.get(new ResourceLocation("minecraft_gators:disc_sound")),
				new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(1).rarity(Rarity.RARE));
	}
}
