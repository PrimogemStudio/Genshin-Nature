package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class FollowtoggleProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)) {
			if (entity.getPersistentData().getBoolean("Follow") == false) {
				entity.getPersistentData().putBoolean("Follow", true);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Following Enabled"), false);
			} else if (entity.getPersistentData().getBoolean("Follow") == true) {
				entity.getPersistentData().putBoolean("Follow", false);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Following Disabled"), false);
			}
		}
	}
}
