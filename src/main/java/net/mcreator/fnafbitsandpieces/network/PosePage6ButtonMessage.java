
package net.mcreator.fnafbitsandpieces.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafbitsandpieces.world.inventory.PosePage6Menu;
import net.mcreator.fnafbitsandpieces.procedures.PoseGrabberProcedure;
import net.mcreator.fnafbitsandpieces.procedures.PageUpProcedure;
import net.mcreator.fnafbitsandpieces.procedures.PageDownProcedure;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PosePage6ButtonMessage {
	private final int buttonID, x, y, z;

	public PosePage6ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PosePage6ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PosePage6ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PosePage6ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = PosePage6Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PoseGrabberProcedure.execute(entity);
		}
		if (buttonID == 1) {

			PageDownProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			PageUpProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FnafBitsAndPiecesMod.addNetworkMessage(PosePage6ButtonMessage.class, PosePage6ButtonMessage::buffer, PosePage6ButtonMessage::new, PosePage6ButtonMessage::handler);
	}
}
