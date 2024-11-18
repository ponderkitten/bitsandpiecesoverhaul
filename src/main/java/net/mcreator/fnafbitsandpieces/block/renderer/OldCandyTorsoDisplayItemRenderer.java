package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.OldCandyTorsoDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.OldCandyTorsoDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OldCandyTorsoDisplayItemRenderer extends GeoItemRenderer<OldCandyTorsoDisplayItem> {
	public OldCandyTorsoDisplayItemRenderer() {
		super(new OldCandyTorsoDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldCandyTorsoDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
