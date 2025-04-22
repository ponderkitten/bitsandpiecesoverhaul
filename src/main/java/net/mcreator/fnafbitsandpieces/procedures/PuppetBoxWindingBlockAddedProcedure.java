package net.mcreator.fnafbitsandpieces.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModBlocks;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

import java.util.Map;

public class PuppetBoxWindingBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_WINDING.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_WINDING_EVEN.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:musicbox")), SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:musicbox")), SoundSource.MASTER, 1, 1, false);
				}
			}
			FnafBitsAndPiecesMod.queueServerWork(Mth.nextInt(RandomSource.create(), 100, 2400), () -> {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_WINDING.get()) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/stopsound @a master fnaf_bits_and_pieces:musicbox");
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_WINDING_EVEN.get()) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/stopsound @a master fnaf_bits_and_pieces:musicbox");
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE_EVEN.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE_EVEN.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:jumpscare")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:jumpscare")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			FnafBitsAndPiecesMod.queueServerWork(60, () -> {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE.get()) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = FnafBitsAndPiecesModBlocks.PUPPET_BOX_SLUMPED.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafBitsAndPiecesModBlocks.PUPPET_BOX_JUMPSCARE_EVEN.get()) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = FnafBitsAndPiecesModBlocks.PUPPET_BOX_SLUMPED_EVEN.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		}
	}
}
