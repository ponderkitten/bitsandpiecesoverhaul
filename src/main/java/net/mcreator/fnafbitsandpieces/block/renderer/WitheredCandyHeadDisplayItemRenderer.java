package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.WitheredCandyHeadDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.WitheredCandyHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredCandyHeadDisplayItemRenderer extends GeoItemRenderer<WitheredCandyHeadDisplayItem> {
	public WitheredCandyHeadDisplayItemRenderer() {
		super(new WitheredCandyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredCandyHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
