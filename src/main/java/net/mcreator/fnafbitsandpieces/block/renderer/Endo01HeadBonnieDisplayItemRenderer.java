package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01HeadBonnieDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01HeadBonnieDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01HeadBonnieDisplayItemRenderer extends GeoItemRenderer<Endo01HeadBonnieDisplayItem> {
	public Endo01HeadBonnieDisplayItemRenderer() {
		super(new Endo01HeadBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01HeadBonnieDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
