
package net.mcreator.minecraftgators.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;

import java.util.List;
import java.util.Collections;

public class CatFoodBlockBlock extends Block {
	public CatFoodBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.slime_block.step")),
						() -> new SoundEvent(new ResourceLocation("block.slime_block.step")),
						() -> new SoundEvent(new ResourceLocation("block.slime_block.place")),
						() -> new SoundEvent(new ResourceLocation("block.slime_block.hit")),
						() -> new SoundEvent(new ResourceLocation("entity.slime.squish"))))
				.strength(0.5f, 5f).speedFactor(0.6f).jumpFactor(0.6f));
		setRegistryName("cat_food_block");
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.2f, 0.2f, 0f};
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.PODZOL;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MinecraftGatorsModItems.CAT_FOOD));
	}
}
