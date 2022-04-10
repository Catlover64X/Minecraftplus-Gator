
package net.mcreator.minecraftgators.enchantment;

public class BaneofCatsEnchantment extends Enchantment {

	public BaneofCatsEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
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
