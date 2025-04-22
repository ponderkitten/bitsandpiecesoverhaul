package net.mcreator.fnafbitsandpieces.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModBlocks;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

import java.util.Map;

public class FreddyBoxOnPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FnafBitsAndPiecesMod.queueServerWork(10, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:coins")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:coins")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		});
		FnafBitsAndPiecesMod.queueServerWork(25, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:freddyboxsong")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:freddyboxsong")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		});
		FnafBitsAndPiecesMod.queueServerWork(360, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:printing")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:printing")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		});
		FnafBitsAndPiecesMod.queueServerWork(400, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.FREDDY_BOX_SPIN.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.FREDDY_BOX_A.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = FnafBitsAndPiecesModBlocks.FREDDY_BOX.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/give @p fnaf_bits_and_pieces:ticket");
			}
		});
	}
}
