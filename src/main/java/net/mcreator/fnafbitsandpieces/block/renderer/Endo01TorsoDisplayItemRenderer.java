package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01TorsoDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.Endo01TorsoDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01TorsoDisplayItemRenderer extends GeoItemRenderer<Endo01TorsoDisplayItem> {
	public Endo01TorsoDisplayItemRenderer() {
		super(new Endo01TorsoDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01TorsoDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
