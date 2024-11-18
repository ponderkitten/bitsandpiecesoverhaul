package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.WitheredGoldenFreddyLeftLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.WitheredGoldenFreddyLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredGoldenFreddyLeftLegDisplayItemRenderer extends GeoItemRenderer<WitheredGoldenFreddyLeftLegDisplayItem> {
	public WitheredGoldenFreddyLeftLegDisplayItemRenderer() {
		super(new WitheredGoldenFreddyLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredGoldenFreddyLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
