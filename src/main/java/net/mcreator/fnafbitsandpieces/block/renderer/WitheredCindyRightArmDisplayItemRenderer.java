package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.WitheredCindyRightArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.WitheredCindyRightArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WitheredCindyRightArmDisplayItemRenderer extends GeoItemRenderer<WitheredCindyRightArmDisplayItem> {
	public WitheredCindyRightArmDisplayItemRenderer() {
		super(new WitheredCindyRightArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredCindyRightArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
