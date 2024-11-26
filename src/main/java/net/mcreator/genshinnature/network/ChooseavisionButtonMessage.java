
package net.mcreator.genshinnature.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.world.inventory.ChooseavisionMenu;
import net.mcreator.genshinnature.procedures.SpawnanemovisionProcedure;
import net.mcreator.genshinnature.procedures.AddpyrovisionProcedure;
import net.mcreator.genshinnature.procedures.AddhydrovisionProcedure;
import net.mcreator.genshinnature.procedures.AddgeovisionProcedure;
import net.mcreator.genshinnature.procedures.AddelectrovisionProcedure;
import net.mcreator.genshinnature.procedures.AdddendrovisionProcedure;
import net.mcreator.genshinnature.procedures.AddcryovisionProcedure;
import net.mcreator.genshinnature.procedures.AddblankvisionProcedure;
import net.mcreator.genshinnature.GenshinNatureMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ChooseavisionButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ChooseavisionButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(GenshinNatureMod.MODID, "chooseavision_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ChooseavisionButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ChooseavisionButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ChooseavisionButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<ChooseavisionButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ChooseavisionButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ChooseavisionMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SpawnanemovisionProcedure.execute(entity);
		}
		if (buttonID == 1) {

			AddblankvisionProcedure.execute(entity);
		}
		if (buttonID == 2) {

			AddcryovisionProcedure.execute(entity);
		}
		if (buttonID == 3) {

			AddelectrovisionProcedure.execute(entity);
		}
		if (buttonID == 4) {

			AddgeovisionProcedure.execute(entity);
		}
		if (buttonID == 5) {

			AddhydrovisionProcedure.execute(entity);
		}
		if (buttonID == 6) {

			AddpyrovisionProcedure.execute(entity);
		}
		if (buttonID == 7) {

			AdddendrovisionProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GenshinNatureMod.addNetworkMessage(ChooseavisionButtonMessage.TYPE, ChooseavisionButtonMessage.STREAM_CODEC, ChooseavisionButtonMessage::handleData);
	}
}
