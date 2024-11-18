package net.mcreator.fnafbitsandpieces.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafbitsandpieces.world.inventory.PosePage9Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage8Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage7Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage6Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage5Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage4Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage3Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage2Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage1Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage19Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage18Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage17Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage16Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage15Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage14Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage13Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage12Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage11Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage10Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage0Menu;

public class PoseGrabberProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) == true) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
				if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage0Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.WHITE_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage1Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.ORANGE_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage2Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.MAGENTA_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage3Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.LIGHT_BLUE_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage4Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.YELLOW_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage5Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.LIME_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage6Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.PINK_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage7Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.GRAY_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage8Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.LIGHT_GRAY_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage9Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.CYAN_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage10Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.PURPLE_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage11Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.BLUE_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage12Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.BROWN_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage13Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.GREEN_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage14Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.RED_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage15Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.BLACK_WOOL);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage16Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.WHITE_TERRACOTTA);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage17Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.ORANGE_TERRACOTTA);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage18Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.MAGENTA_TERRACOTTA);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (entity instanceof Player _plr ? _plr.containerMenu instanceof PosePage19Menu : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.LIGHT_BLUE_TERRACOTTA);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}
