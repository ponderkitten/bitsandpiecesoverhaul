package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.PurpleGuyLeftArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.PurpleGuyLeftArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PurpleGuyLeftArmDisplayItemRenderer extends GeoItemRenderer<PurpleGuyLeftArmDisplayItem> {
	public PurpleGuyLeftArmDisplayItemRenderer() {
		super(new PurpleGuyLeftArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(PurpleGuyLeftArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
