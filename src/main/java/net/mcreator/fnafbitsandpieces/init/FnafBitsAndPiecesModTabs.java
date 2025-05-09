
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafbitsandpieces.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FnafBitsAndPiecesModTabs {
	public static CreativeModeTab TAB_FRED_BEARS;
	public static CreativeModeTab TAB_BP_ITEMS;
	public static CreativeModeTab TAB_FNAF_1;
	public static CreativeModeTab TAB_FNAF_2;
	public static CreativeModeTab TAB_FNAF_3;
	public static CreativeModeTab TAB_PHONE_CALLS;
	public static CreativeModeTab TAB_FNAC;
	public static CreativeModeTab TAB_BP_BLOCKS;

	public static void load() {
		TAB_FRED_BEARS = new CreativeModeTab("tabfred_bears") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.FRED_BEAR_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BP_ITEMS = new CreativeModeTab("tabbp_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModItems.PUPPET_KEY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_1 = new CreativeModeTab("tabfnaf_1") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.FREDDY_FAZBEAR_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_2 = new CreativeModeTab("tabfnaf_2") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.WITHERED_FOXY_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_3 = new CreativeModeTab("tabfnaf_3") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.SPRINGTRAP_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PHONE_CALLS = new CreativeModeTab("tabphone_calls") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModItems.MYSTERIOUS_CASSETTE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAC = new CreativeModeTab("tabfnac") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.CANDY_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BP_BLOCKS = new CreativeModeTab("tabbp_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafBitsAndPiecesModBlocks.PUPPET_BOX.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
