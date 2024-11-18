package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.OffsetBonnieBunnyShowtimeDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.OffsetBonnieBunnyShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OffsetBonnieBunnyShowtimeDisplayItemRenderer extends GeoItemRenderer<OffsetBonnieBunnyShowtimeDisplayItem> {
	public OffsetBonnieBunnyShowtimeDisplayItemRenderer() {
		super(new OffsetBonnieBunnyShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(OffsetBonnieBunnyShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
