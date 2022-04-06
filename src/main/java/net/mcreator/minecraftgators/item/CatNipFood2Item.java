
package net.mcreator.minecraftgators.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.minecraftgators.procedures.CookedCatNipEatenProcedure;
import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;

public class CatNipFood2Item extends Item {
	public CatNipFood2Item() {
		super(new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(4f)

						.build()));
		setRegistryName("cat_nip_food_2");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 80;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CookedCatNipEatenProcedure.execute(entity);
		return retval;
	}
}
