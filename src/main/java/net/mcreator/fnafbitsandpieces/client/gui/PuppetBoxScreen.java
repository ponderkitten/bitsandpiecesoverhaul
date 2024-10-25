package net.mcreator.fnafbitsandpieces.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafbitsandpieces.world.inventory.PuppetBoxMenu;
import net.mcreator.fnafbitsandpieces.network.PuppetBoxButtonMessage;
import net.mcreator.fnafbitsandpieces.FnafBitsAndPiecesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PuppetBoxScreen extends AbstractContainerScreen<PuppetBoxMenu> {
	private final static HashMap<String, Object> guistate = PuppetBoxMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_default;

	public PuppetBoxScreen(PuppetBoxMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_bits_and_pieces:textures/screens/puppet_box.png");

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
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_488"), 141, 16, -13369549);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_439"), 141, 25, -16737793);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_024"), 141, 34, -16724839);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_037"), 141, 43, -256);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_011"), 141, 52, -6750055);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.label_001"), 141, 61, -16777216);
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
		button_default = new Button(this.leftPos + 6, this.topPos + 61, 61, 20, Component.translatable("gui.fnaf_bits_and_pieces.puppet_box.button_default"), e -> {
			if (true) {
				FnafBitsAndPiecesMod.PACKET_HANDLER.sendToServer(new PuppetBoxButtonMessage(0, x, y, z));
				PuppetBoxButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_default", button_default);
		this.addRenderableWidget(button_default);
	}
}
