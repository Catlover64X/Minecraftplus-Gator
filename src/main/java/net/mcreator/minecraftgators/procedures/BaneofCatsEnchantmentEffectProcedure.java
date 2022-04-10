package net.mcreator.minecraftgators.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BaneofCatsEnchantmentEffectProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof StormFollowerEntity) {
			if (EnchantmentHelper.getItemEnchantmentLevel(MinecraftGatorsModEnchantments.BANEOF_CATS, itemstack) == 1) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, (false), (false)));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(MinecraftGatorsModEnchantments.BANEOF_CATS, itemstack) == 2) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, (false), (false)));
			}
		}
	}
}
