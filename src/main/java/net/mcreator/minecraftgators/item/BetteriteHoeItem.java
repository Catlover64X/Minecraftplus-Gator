
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;

public class BetteriteHoeItem extends HoeItem {
	public BetteriteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2789;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinecraftGatorsModItems.BETTERITE_INGOT));
			}
		}, 0, -3f, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
		setRegistryName("betterite_hoe");
	}
}
