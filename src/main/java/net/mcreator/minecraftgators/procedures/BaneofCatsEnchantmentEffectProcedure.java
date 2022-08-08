package net.mcreator.minecraftgators.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minecraftgators.init.MinecraftGatorsModEnchantments;
import net.mcreator.minecraftgators.entity.StormFollowerEntity;

public class BaneofCatsEnchantmentEffectProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof StormFollowerEntity) {
			if (EnchantmentHelper.getItemEnchantmentLevel(MinecraftGatorsModEnchantments.BANEOF_CATS.get(), itemstack) == 1) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, (false), (false)));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(MinecraftGatorsModEnchantments.BANEOF_CATS.get(), itemstack) == 2) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, (false), (false)));
			}
		}
	}
}
