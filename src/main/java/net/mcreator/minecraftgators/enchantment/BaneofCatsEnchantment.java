
package net.mcreator.minecraftgators.enchantment;

public class BaneofCatsEnchantment extends Enchantment {

	public BaneofCatsEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == MinecraftGatorsModItems.BETTERITE_SWORD)
			return true;
		if (stack.getItem() == MinecraftGatorsModItems.CAT_JESUS_DUST_SWORD)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
