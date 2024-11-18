package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.WitheredFoxyTorsoDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.WitheredFoxyTorsoDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredFoxyTorsoDisplayItemRenderer extends GeoItemRenderer<WitheredFoxyTorsoDisplayItem> {
	public WitheredFoxyTorsoDisplayItemRenderer() {
		super(new WitheredFoxyTorsoDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredFoxyTorsoDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
