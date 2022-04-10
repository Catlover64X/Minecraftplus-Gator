
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion CAT_NIP = register(new Potion(new MobEffectInstance(MobEffects.CONFUSION, 2000, 0, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 5, false, true)).setRegistryName("cat_nip"));
	public static final Potion CAT_JESUSS_BLOOD = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2, false, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 2, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, true))
					.setRegistryName("cat_jesuss_blood"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
