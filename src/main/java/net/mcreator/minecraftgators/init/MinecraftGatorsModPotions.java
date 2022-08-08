
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minecraftgators.MinecraftGatorsMod;

public class MinecraftGatorsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MinecraftGatorsMod.MODID);
	public static final RegistryObject<Potion> CAT_NIP = REGISTRY.register("cat_nip",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 2000, 0, false, true),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 5, false, true)));
	public static final RegistryObject<Potion> CAT_JESUSS_BLOOD = REGISTRY.register("cat_jesuss_blood",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, true)));
}
