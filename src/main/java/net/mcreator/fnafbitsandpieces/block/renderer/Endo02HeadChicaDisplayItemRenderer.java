package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02HeadChicaDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadChicaDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02HeadChicaDisplayItemRenderer extends GeoItemRenderer<Endo02HeadChicaDisplayItem> {
	public Endo02HeadChicaDisplayItemRenderer() {
		super(new Endo02HeadChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadChicaDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
