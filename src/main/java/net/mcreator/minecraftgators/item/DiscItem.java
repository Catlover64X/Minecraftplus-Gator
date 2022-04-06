
package net.mcreator.minecraftgators.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.minecraftgators.procedures.DiscRightClickedInAirProcedure;
import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModSounds;

import java.util.List;

public class DiscItem extends RecordItem {
	public DiscItem() {
		super(0, MinecraftGatorsModSounds.REGISTRY.get(new ResourceLocation("minecraft_gators:disc_sound")),
				new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("disc");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("You just got rickrolled"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		DiscRightClickedInAirProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}
}
