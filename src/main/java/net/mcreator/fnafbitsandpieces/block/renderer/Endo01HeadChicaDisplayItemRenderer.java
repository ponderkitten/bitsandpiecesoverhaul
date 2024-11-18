package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01HeadChicaDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01HeadChicaDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01HeadChicaDisplayItemRenderer extends GeoItemRenderer<Endo01HeadChicaDisplayItem> {
	public Endo01HeadChicaDisplayItemRenderer() {
		super(new Endo01HeadChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01HeadChicaDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
