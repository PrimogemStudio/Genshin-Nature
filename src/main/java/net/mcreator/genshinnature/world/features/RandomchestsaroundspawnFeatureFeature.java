
package net.mcreator.genshinnature.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.genshinnature.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.genshinnature.procedures.DontspawninwaterProcedure;

public class RandomchestsaroundspawnFeatureFeature extends StructureFeature {
	public RandomchestsaroundspawnFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!DontspawninwaterProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
