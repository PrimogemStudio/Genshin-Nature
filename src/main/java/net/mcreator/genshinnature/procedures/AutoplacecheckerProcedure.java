package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class AutoplacecheckerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AutoplacehuntersbowProcedure.execute(entity);
		AutoplacedullbladeProcedure.execute(entity);
		AutoplacesilverswordProcedure.execute(entity);
		AutoplacekitaincrossspearProcedure.execute(entity);
		AutoplaceskywardatlasProcedure.execute(entity);
		AutoplacevortexvanquisherProcedure.execute(entity);
		AutoplaceskywarpharpProcedure.execute(entity);
		AutoplaceapprenticesnotesProcedure.execute(entity);
		AutoplaceoldmercspalProcedure.execute(entity);
		AutoplacebeginnersprotectorProcedure.execute(entity);
		AutoplacepocketgrimoireProcedure.execute(entity);
		AutoplacewastergreatswordProcedure.execute(entity);
		AutoplaceironpointProcedure.execute(entity);
	}
}
