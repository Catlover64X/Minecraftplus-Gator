
package net.mcreator.minecraftgators.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftgators.init.MinecraftGatorsModTabs;
import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;

public abstract class BetteriteArmorItem extends ArmorItem {
	public BetteriteArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 38;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 10, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 23;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinecraftGatorsModItems.RUBY));
			}

			@Override
			public String getName() {
				return "betterite_armor";
			}

			@Override
			public float getToughness() {
				return 3.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BetteriteArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
			setRegistryName("betterite_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_gators:textures/models/armor/betterite_layer_1.png";
		}
	}

	public static class Chestplate extends BetteriteArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
			setRegistryName("betterite_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_gators:textures/models/armor/betterite_layer_1.png";
		}
	}

	public static class Leggings extends BetteriteArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
			setRegistryName("betterite_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_gators:textures/models/armor/betterite_layer_2.png";
		}
	}

	public static class Boots extends BetteriteArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MinecraftGatorsModTabs.TAB_MINECRAFTPLUS_GATOR));
			setRegistryName("betterite_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_gators:textures/models/armor/betterite_layer_1.png";
		}
	}
}
