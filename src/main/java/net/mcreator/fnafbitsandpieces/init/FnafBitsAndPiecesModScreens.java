
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafbitsandpieces.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.fnafbitsandpieces.client.gui.PuppetBoxScreen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage9Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage8Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage7Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage6Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage5Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage4Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage3Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage2Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage1Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage15Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage14Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage13Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage12Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage11Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage10Screen;
import net.mcreator.fnafbitsandpieces.client.gui.PosePage0Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FnafBitsAndPiecesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_0.get(), PosePage0Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_1.get(), PosePage1Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_2.get(), PosePage2Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_3.get(), PosePage3Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_4.get(), PosePage4Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_5.get(), PosePage5Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_6.get(), PosePage6Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_7.get(), PosePage7Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_8.get(), PosePage8Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_9.get(), PosePage9Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_10.get(), PosePage10Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_11.get(), PosePage11Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_12.get(), PosePage12Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_13.get(), PosePage13Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_14.get(), PosePage14Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.POSE_PAGE_15.get(), PosePage15Screen::new);
			MenuScreens.register(FnafBitsAndPiecesModMenus.PUPPET_BOX.get(), PuppetBoxScreen::new);
		});
	}
}
