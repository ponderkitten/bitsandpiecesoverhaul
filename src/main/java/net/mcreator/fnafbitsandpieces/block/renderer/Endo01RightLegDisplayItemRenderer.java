package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01RightLegDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01RightLegDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01RightLegDisplayItemRenderer extends GeoItemRenderer<Endo01RightLegDisplayItem> {
	public Endo01RightLegDisplayItemRenderer() {
		super(new Endo01RightLegDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01RightLegDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
