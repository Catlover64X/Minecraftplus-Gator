package net.mcreator.minecraftgators.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.minecraftgators.entity.BlazeKingEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlazekinghurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof BlazeKingEntity) {
			if (Math.random() < 0.4) {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Blaze King: i will steal your exp for my power!"), (true));
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 3, (false), (false)));
			}
		}
	}
}
