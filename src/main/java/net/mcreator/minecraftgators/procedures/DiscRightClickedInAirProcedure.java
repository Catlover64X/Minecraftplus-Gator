package net.mcreator.minecraftgators.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DiscRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minecraft_gators:disc_sound")), SoundSource.RECORDS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minecraft_gators:disc_sound")),
						SoundSource.RECORDS, 1, 1, false);
			}
		}
	}
}
