package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02HeadFoxyDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadFoxyDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02HeadFoxyDisplayItemRenderer extends GeoItemRenderer<Endo02HeadFoxyDisplayItem> {
	public Endo02HeadFoxyDisplayItemRenderer() {
		super(new Endo02HeadFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadFoxyDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
