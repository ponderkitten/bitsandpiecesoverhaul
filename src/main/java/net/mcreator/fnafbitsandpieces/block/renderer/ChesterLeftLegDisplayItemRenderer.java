package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.ChesterLeftLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.ChesterLeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChesterLeftLegDisplayItemRenderer extends GeoItemRenderer<ChesterLeftLegDisplayItem> {
	public ChesterLeftLegDisplayItemRenderer() {
		super(new ChesterLeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChesterLeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
