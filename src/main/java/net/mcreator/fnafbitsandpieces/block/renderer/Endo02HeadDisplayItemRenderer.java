package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02HeadDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02HeadDisplayItemRenderer extends GeoItemRenderer<Endo02HeadDisplayItem> {
	public Endo02HeadDisplayItemRenderer() {
		super(new Endo02HeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
