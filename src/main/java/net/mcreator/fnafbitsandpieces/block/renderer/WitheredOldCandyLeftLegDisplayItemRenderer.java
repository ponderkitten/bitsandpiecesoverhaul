package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.WitheredOldCandyLeftLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.WitheredOldCandyLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredOldCandyLeftLegDisplayItemRenderer extends GeoItemRenderer<WitheredOldCandyLeftLegDisplayItem> {
	public WitheredOldCandyLeftLegDisplayItemRenderer() {
		super(new WitheredOldCandyLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredOldCandyLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
