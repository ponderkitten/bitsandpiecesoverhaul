package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02RightLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02RightLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02RightLegDisplayItemRenderer extends GeoItemRenderer<Endo02RightLegDisplayItem> {
	public Endo02RightLegDisplayItemRenderer() {
		super(new Endo02RightLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02RightLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
