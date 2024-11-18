package net.mcreator.fnafbitsandpieces.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class RockafireCheckProcedure {
	public static void execute(LevelAccessor world) {
		if (ModList.get().isLoaded("forge") == true) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Rockafire is loaded"), false);
		}
	}
}
