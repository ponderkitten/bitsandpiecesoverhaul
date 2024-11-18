package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02HeadBonnieDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadBonnieDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02HeadBonnieDisplayItemRenderer extends GeoItemRenderer<Endo02HeadBonnieDisplayItem> {
	public Endo02HeadBonnieDisplayItemRenderer() {
		super(new Endo02HeadBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadBonnieDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
