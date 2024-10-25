
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafbitsandpieces.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fnafbitsandpieces.world.inventory.PuppetBoxMenu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage9Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage8Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage7Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage6Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage5Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage4Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage3Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage2Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage1Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage15Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage14Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage13Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage12Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage11Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage10Menu;
import net.mcreator.fnafbitsandpieces.world.inventory.PosePage0Menu;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

public class FnafBitsAndPiecesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FnafBitsAndPiecesMod.MODID);
	public static final RegistryObject<MenuType<PosePage0Menu>> POSE_PAGE_0 = REGISTRY.register("pose_page_0", () -> IForgeMenuType.create(PosePage0Menu::new));
	public static final RegistryObject<MenuType<PosePage1Menu>> POSE_PAGE_1 = REGISTRY.register("pose_page_1", () -> IForgeMenuType.create(PosePage1Menu::new));
	public static final RegistryObject<MenuType<PosePage2Menu>> POSE_PAGE_2 = REGISTRY.register("pose_page_2", () -> IForgeMenuType.create(PosePage2Menu::new));
	public static final RegistryObject<MenuType<PosePage3Menu>> POSE_PAGE_3 = REGISTRY.register("pose_page_3", () -> IForgeMenuType.create(PosePage3Menu::new));
	public static final RegistryObject<MenuType<PosePage4Menu>> POSE_PAGE_4 = REGISTRY.register("pose_page_4", () -> IForgeMenuType.create(PosePage4Menu::new));
	public static final RegistryObject<MenuType<PosePage5Menu>> POSE_PAGE_5 = REGISTRY.register("pose_page_5", () -> IForgeMenuType.create(PosePage5Menu::new));
	public static final RegistryObject<MenuType<PosePage6Menu>> POSE_PAGE_6 = REGISTRY.register("pose_page_6", () -> IForgeMenuType.create(PosePage6Menu::new));
	public static final RegistryObject<MenuType<PosePage7Menu>> POSE_PAGE_7 = REGISTRY.register("pose_page_7", () -> IForgeMenuType.create(PosePage7Menu::new));
	public static final RegistryObject<MenuType<PosePage8Menu>> POSE_PAGE_8 = REGISTRY.register("pose_page_8", () -> IForgeMenuType.create(PosePage8Menu::new));
	public static final RegistryObject<MenuType<PosePage9Menu>> POSE_PAGE_9 = REGISTRY.register("pose_page_9", () -> IForgeMenuType.create(PosePage9Menu::new));
	public static final RegistryObject<MenuType<PosePage10Menu>> POSE_PAGE_10 = REGISTRY.register("pose_page_10", () -> IForgeMenuType.create(PosePage10Menu::new));
	public static final RegistryObject<MenuType<PosePage11Menu>> POSE_PAGE_11 = REGISTRY.register("pose_page_11", () -> IForgeMenuType.create(PosePage11Menu::new));
	public static final RegistryObject<MenuType<PosePage12Menu>> POSE_PAGE_12 = REGISTRY.register("pose_page_12", () -> IForgeMenuType.create(PosePage12Menu::new));
	public static final RegistryObject<MenuType<PosePage13Menu>> POSE_PAGE_13 = REGISTRY.register("pose_page_13", () -> IForgeMenuType.create(PosePage13Menu::new));
	public static final RegistryObject<MenuType<PosePage14Menu>> POSE_PAGE_14 = REGISTRY.register("pose_page_14", () -> IForgeMenuType.create(PosePage14Menu::new));
	public static final RegistryObject<MenuType<PosePage15Menu>> POSE_PAGE_15 = REGISTRY.register("pose_page_15", () -> IForgeMenuType.create(PosePage15Menu::new));
	public static final RegistryObject<MenuType<PuppetBoxMenu>> PUPPET_BOX = REGISTRY.register("puppet_box", () -> IForgeMenuType.create(PuppetBoxMenu::new));
}
