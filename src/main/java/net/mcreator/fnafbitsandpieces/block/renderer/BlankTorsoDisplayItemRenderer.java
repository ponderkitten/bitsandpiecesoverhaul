package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.BlankTorsoDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.BlankTorsoDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlankTorsoDisplayItemRenderer extends GeoItemRenderer<BlankTorsoDisplayItem> {
	public BlankTorsoDisplayItemRenderer() {
		super(new BlankTorsoDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlankTorsoDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
