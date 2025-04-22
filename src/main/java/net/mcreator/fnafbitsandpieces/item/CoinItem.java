
package net.mcreator.fnafbitsandpieces.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModTabs;

public class CoinItem extends Item {
	public CoinItem() {
		super(new Item.Properties().tab(FnafBitsAndPiecesModTabs.TAB_BP_ITEMS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}
}
