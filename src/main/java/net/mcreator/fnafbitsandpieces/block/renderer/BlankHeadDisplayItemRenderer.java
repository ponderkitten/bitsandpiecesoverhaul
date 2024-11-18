package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.BlankHeadDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.BlankHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlankHeadDisplayItemRenderer extends GeoItemRenderer<BlankHeadDisplayItem> {
	public BlankHeadDisplayItemRenderer() {
		super(new BlankHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlankHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
