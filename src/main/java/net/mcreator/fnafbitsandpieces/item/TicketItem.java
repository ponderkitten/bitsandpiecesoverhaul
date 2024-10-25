
package net.mcreator.fnafbitsandpieces.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModTabs;

public class TicketItem extends Item {
	public TicketItem() {
		super(new Item.Properties().tab(FnafBitsAndPiecesModTabs.TAB_BP_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
