
package net.mcreator.minecraftgators.item;

import net.minecraft.network.chat.Component;

public class DiscItem extends RecordItem {

	public DiscItem() {
		super(0, MinecraftGatorsModSounds.REGISTRY.get(new ResourceLocation("minecraft_gators:disc_sound")),
				new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(1).rarity(Rarity.RARE));

		setRegistryName("disc");
	}

}
