package net.mcreator.minecraftgators.procedures;

import net.minecraft.world.entity.Entity;

public class LightonFireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
