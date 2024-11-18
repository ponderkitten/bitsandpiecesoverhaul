package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01RightArmFoxyDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01RightArmFoxyDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01RightArmFoxyDisplayItemRenderer extends GeoItemRenderer<Endo01RightArmFoxyDisplayItem> {
	public Endo01RightArmFoxyDisplayItemRenderer() {
		super(new Endo01RightArmFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01RightArmFoxyDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
