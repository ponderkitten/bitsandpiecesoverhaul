package net.mcreator.fnafbitsandpieces.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafbitsandpieces.world.inventory.PosePage10Menu;
import net.mcreator.fnafbitsandpieces.procedures.BookcheatsshowProcedure;
import net.mcreator.fnafbitsandpieces.network.PosePage10ButtonMessage;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PosePage10Screen extends AbstractContainerScreen<PosePage10Menu> {
	private final static HashMap<String, Object> guistate = PosePage10Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_yoink;
	ImageButton imagebutton_pagecornerleft;
	ImageButton imagebutton_pagecornerright;

	public PosePage10Screen(PosePage10Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_bits_and_pieces:textures/screens/pose_page_10.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_bits_and_pieces:textures/screens/bookpose10.png"));
		this.blit(ms, this.leftPos + -50, this.topPos + -14, 0, 0, 280, 180, 280, 180);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_yoink = new Button(this.leftPos + 135, this.topPos + -4, 51, 20, Component.translatable("gui.fnaf_bits_and_pieces.pose_page_10.button_yoink"), e -> {
			if (BookcheatsshowProcedure.execute(entity)) {
				FnafBitsAndPiecesMod.PACKET_HANDLER.sendToServer(new PosePage10ButtonMessage(0, x, y, z));
				PosePage10ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (BookcheatsshowProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_yoink", button_yoink);
		this.addRenderableWidget(button_yoink);
		imagebutton_pagecornerleft = new ImageButton(this.leftPos + -39, this.topPos + 143, 13, 14, 0, 0, 14, new ResourceLocation("fnaf_bits_and_pieces:textures/screens/atlas/imagebutton_pagecornerleft.png"), 13, 28, e -> {
			if (true) {
				FnafBitsAndPiecesMod.PACKET_HANDLER.sendToServer(new PosePage10ButtonMessage(1, x, y, z));
				PosePage10ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_pagecornerleft", imagebutton_pagecornerleft);
		this.addRenderableWidget(imagebutton_pagecornerleft);
		imagebutton_pagecornerright = new ImageButton(this.leftPos + 205, this.topPos + 143, 13, 14, 0, 0, 14, new ResourceLocation("fnaf_bits_and_pieces:textures/screens/atlas/imagebutton_pagecornerright.png"), 13, 28, e -> {
			if (true) {
				FnafBitsAndPiecesMod.PACKET_HANDLER.sendToServer(new PosePage10ButtonMessage(2, x, y, z));
				PosePage10ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_pagecornerright", imagebutton_pagecornerright);
		this.addRenderableWidget(imagebutton_pagecornerright);
	}
}
