package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02LeftLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02LeftLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02LeftLegDisplayItemRenderer extends GeoItemRenderer<Endo02LeftLegDisplayItem> {
	public Endo02LeftLegDisplayItemRenderer() {
		super(new Endo02LeftLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02LeftLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
