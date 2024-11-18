package net.mcreator.fnafbitsandpieces.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class FnacCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ModList.get().isLoaded("fnac_mod") == false) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Install Burgers and Fries to use this block."), false);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
