
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("minecraft_gators", "disc_sound"), new SoundEvent(new ResourceLocation("minecraft_gators", "disc_sound")));
		REGISTRY.put(new ResourceLocation("minecraft_gators", "rat_disc_sound"),
				new SoundEvent(new ResourceLocation("minecraft_gators", "rat_disc_sound")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
