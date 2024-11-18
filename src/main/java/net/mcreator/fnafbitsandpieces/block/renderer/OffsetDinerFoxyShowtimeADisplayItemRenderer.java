package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.OffsetDinerFoxyShowtimeADisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerFoxyShowtimeADisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OffsetDinerFoxyShowtimeADisplayItemRenderer extends GeoItemRenderer<OffsetDinerFoxyShowtimeADisplayItem> {
	public OffsetDinerFoxyShowtimeADisplayItemRenderer() {
		super(new OffsetDinerFoxyShowtimeADisplayModel());
	}

	@Override
	public RenderType getRenderType(OffsetDinerFoxyShowtimeADisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
