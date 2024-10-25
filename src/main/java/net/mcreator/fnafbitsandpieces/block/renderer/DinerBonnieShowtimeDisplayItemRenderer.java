package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.DinerBonnieShowtimeDisplayModel;
import net.mcreator.fnafbitsandpieces.block.display.DinerBonnieShowtimeDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DinerBonnieShowtimeDisplayItemRenderer extends GeoItemRenderer<DinerBonnieShowtimeDisplayItem> {
	public DinerBonnieShowtimeDisplayItemRenderer() {
		super(new DinerBonnieShowtimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(DinerBonnieShowtimeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
