package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01LeftArmDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01LeftArmDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01LeftArmDisplayItemRenderer extends GeoItemRenderer<Endo01LeftArmDisplayItem> {
	public Endo01LeftArmDisplayItemRenderer() {
		super(new Endo01LeftArmDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01LeftArmDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
