package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.genshinnature.world.inventory.ChooseavisionMenu;
import net.mcreator.genshinnature.network.GenshinNatureModVariables;
import net.mcreator.genshinnature.GenshinNatureMod;

import javax.annotation.Nullable;

import java.util.ArrayList;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class DetectifitsthefirsttimeaplayerjoinsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(GenshinNatureModVariables.PLAYER_VARIABLES).hasPlayerEnteredTheWorld == 0) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Chooseavision");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new ChooseavisionMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"tellraw @p {\"text\":\"Thanks for playing Genshin Nature! Click here if you want to join our official Discord server.\",\"color\":\"#02FF00\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/U7ue38S2QX\"}}");
			}
		}
		GenshinNatureMod.queueServerWork(40, () -> {
			{
				GenshinNatureModVariables.PlayerVariables _vars = entity.getData(GenshinNatureModVariables.PLAYER_VARIABLES);
				_vars.hasPlayerEnteredTheWorld = 1;
				_vars.syncPlayerVariables(entity);
			}
		});
	}
}
