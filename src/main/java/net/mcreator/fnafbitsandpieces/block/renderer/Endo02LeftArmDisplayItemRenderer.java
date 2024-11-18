package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo02LeftArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo02LeftArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo02LeftArmDisplayItemRenderer extends GeoItemRenderer<Endo02LeftArmDisplayItem> {
	public Endo02LeftArmDisplayItemRenderer() {
		super(new Endo02LeftArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02LeftArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
