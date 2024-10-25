
package net.mcreator.fnafbitsandpieces.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.fnafbitsandpieces.procedures.BookOpenProcedure;
import net.mcreator.fnafbitsandpieces.init.FnafBitsAndPiecesModTabs;

public class FazbearEmployeeManualItem extends Item {
	public FazbearEmployeeManualItem() {
		super(new Item.Properties().tab(FnafBitsAndPiecesModTabs.TAB_BP_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BookOpenProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
