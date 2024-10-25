package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.UnwitheredGoldenFreddyRightArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenFreddyRightArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UnwitheredGoldenFreddyRightArmDisplayItemRenderer extends GeoItemRenderer<UnwitheredGoldenFreddyRightArmDisplayItem> {
	public UnwitheredGoldenFreddyRightArmDisplayItemRenderer() {
		super(new UnwitheredGoldenFreddyRightArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnwitheredGoldenFreddyRightArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
