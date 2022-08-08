
package net.mcreator.minecraftgators.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftgators.init.MinecraftGatorsModFluids;

public class CatrealmsfluidBlock extends LiquidBlock {
	public CatrealmsfluidBlock() {
		super(() -> (FlowingFluid) MinecraftGatorsModFluids.CATREALMSFLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
