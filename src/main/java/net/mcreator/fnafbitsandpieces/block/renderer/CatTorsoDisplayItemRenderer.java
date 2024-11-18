package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.CatTorsoDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.CatTorsoDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CatTorsoDisplayItemRenderer extends GeoItemRenderer<CatTorsoDisplayItem> {
	public CatTorsoDisplayItemRenderer() {
		super(new CatTorsoDisplayModel());
	}

	@Override
	public RenderType getRenderType(CatTorsoDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
