
package net.mcreator.minecraftgators.recipes.brewing;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatJesusBloodRecipeBrewingRecipe implements IBrewingRecipe {

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new CatJesusBloodRecipeBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
				&& PotionUtils.getPotion(input) == MinecraftGatorsModPotions.CAT_NIP;
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == MinecraftGatorsModItems.CAT_JESUS_DUST_DUST;
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionUtils.setPotion(new ItemStack(input.getItem()), MinecraftGatorsModPotions.DELETED_MOD_ELEMENT);
		}
		return ItemStack.EMPTY;
	}

}