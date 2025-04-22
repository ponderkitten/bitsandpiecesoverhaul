package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.AngledSpringtrapShowtimeDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.AngledSpringtrapShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngledSpringtrapShowtimeDisplayItemRenderer extends GeoItemRenderer<AngledSpringtrapShowtimeDisplayItem> {
	public AngledSpringtrapShowtimeDisplayItemRenderer() {
		super(new AngledSpringtrapShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(AngledSpringtrapShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
