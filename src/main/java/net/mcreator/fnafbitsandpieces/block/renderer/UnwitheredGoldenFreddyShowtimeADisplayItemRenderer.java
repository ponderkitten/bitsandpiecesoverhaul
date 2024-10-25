package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.UnwitheredGoldenFreddyShowtimeADisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenFreddyShowtimeADisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UnwitheredGoldenFreddyShowtimeADisplayItemRenderer extends GeoItemRenderer<UnwitheredGoldenFreddyShowtimeADisplayItem> {
	public UnwitheredGoldenFreddyShowtimeADisplayItemRenderer() {
		super(new UnwitheredGoldenFreddyShowtimeADisplayModel());
	}

	@Override
	public RenderType getRenderType(UnwitheredGoldenFreddyShowtimeADisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
