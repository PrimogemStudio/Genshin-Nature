package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class AscensioncheckerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AscendhuntersbowProcedure.execute(entity);
		AscenddullbladeProcedure.execute(entity);
		AscendsilverswordProcedure.execute(entity);
		AscendkitaincrossspearProcedure.execute(entity);
		AscendskywardatlasProcedure.execute(entity);
		AscendvortexvanquisherProcedure.execute(entity);
		AscendskywardharpProcedure.execute(entity);
		AscendapprenticesnotesProcedure.execute(entity);
		AscendoldmercspalProcedure.execute(entity);
		AscendbeginnersprotectorProcedure.execute(entity);
		AscendpocketgrimoireProcedure.execute(entity);
		AscendwastergreatswordProcedure.execute(entity);
		AscendironpointProcedure.execute(entity);
	}
}
