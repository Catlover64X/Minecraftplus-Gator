
package net.mcreator.minecraftgators.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftgators.init.MinecraftGatorsModItems;
import net.mcreator.minecraftgators.init.MinecraftGatorsModFluids;
import net.mcreator.minecraftgators.init.MinecraftGatorsModBlocks;

public abstract class CatrealmsfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(MinecraftGatorsModFluids.CATREALMSFLUID,
			MinecraftGatorsModFluids.FLOWING_CATREALMSFLUID,
			FluidAttributes.builder(new ResourceLocation("minecraft_gators:blocks/catrealmsfluidtexture"),
					new ResourceLocation("minecraft_gators:blocks/flowingcatrealmsfluid"))

	).explosionResistance(100f)

			.bucket(MinecraftGatorsModItems.CATREALMSFLUID_BUCKET).block(() -> (LiquidBlock) MinecraftGatorsModBlocks.CATREALMSFLUID.get());

	private CatrealmsfluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0.5);
	}

	public static class Source extends CatrealmsfluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CatrealmsfluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
