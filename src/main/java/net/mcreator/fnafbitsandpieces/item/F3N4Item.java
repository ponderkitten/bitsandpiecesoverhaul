
package net.mcreator.fnafbitsandpieces.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModTabs;

public class F3N4Item extends RecordItem {
	public F3N4Item() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_bits_and_pieces:fnaf3n4")), new Item.Properties().tab(FnafBitsAndPiecesModTabs.TAB_PHONE_CALLS).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
