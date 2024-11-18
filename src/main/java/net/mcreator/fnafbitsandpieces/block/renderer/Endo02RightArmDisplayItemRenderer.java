package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02RightArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02RightArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02RightArmDisplayItemRenderer extends GeoItemRenderer<Endo02RightArmDisplayItem> {
	public Endo02RightArmDisplayItemRenderer() {
		super(new Endo02RightArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02RightArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
