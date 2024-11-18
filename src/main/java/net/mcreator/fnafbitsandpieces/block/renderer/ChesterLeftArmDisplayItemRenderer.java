package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.ChesterLeftArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.ChesterLeftArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChesterLeftArmDisplayItemRenderer extends GeoItemRenderer<ChesterLeftArmDisplayItem> {
	public ChesterLeftArmDisplayItemRenderer() {
		super(new ChesterLeftArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChesterLeftArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
