
package net.mcreator.minecraftgators.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;

public class BaneofCatsEnchantment extends Enchantment {
	public BaneofCatsEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == MinecraftGatorsModItems.BETTERITE_SWORD.get())
			return true;
		if (stack.getItem() == MinecraftGatorsModItems.CAT_JESUS_DUST_SWORD.get())
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
