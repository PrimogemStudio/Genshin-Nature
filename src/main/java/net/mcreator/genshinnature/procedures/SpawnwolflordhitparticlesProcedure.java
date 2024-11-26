package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.genshinnature.init.GenshinNatureModParticleTypes;

public class SpawnwolflordhitparticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (GenshinNatureModParticleTypes.PARTICLEHITWOLFLORD.get()), x, y, z, 0, 1, 0);
	}
}
