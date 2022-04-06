
package net.mcreator.minecraftgators.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;

public class Cat_Jesus_DustAxeItem extends AxeItem {
	public Cat_Jesus_DustAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1680;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 33f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 55;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinecraftGatorsModItems.CAT_JESUS_DUST_DUST));
			}
		}, 1, -3f, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
		setRegistryName("cat_jesus_dust_axe");
	}
}
