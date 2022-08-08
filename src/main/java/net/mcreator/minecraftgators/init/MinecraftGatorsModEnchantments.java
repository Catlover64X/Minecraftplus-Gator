
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.minecraftgators.enchantment.BaneofCatsEnchantment;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

public class MinecraftGatorsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MinecraftGatorsMod.MODID);
	public static final RegistryObject<Enchantment> BANEOF_CATS = REGISTRY.register("baneof_cats", () -> new BaneofCatsEnchantment());
}
