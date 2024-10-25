
package net.mcreator.fnafbitsandpieces.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModTabs;

import java.util.List;

public class PuppetKeyItem extends Item {
	public PuppetKeyItem() {
		super(new Item.Properties().tab(FnafBitsAndPiecesModTabs.TAB_BP_ITEMS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Used to change puppet box loot table."));
	}
}
