package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.OffsetBrokenFoxyThePirateShowtimeBlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.OffsetBrokenFoxyThePirateShowtimeTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OffsetBrokenFoxyThePirateShowtimeTileRenderer extends GeoBlockRenderer<OffsetBrokenFoxyThePirateShowtimeTileEntity> {
	public OffsetBrokenFoxyThePirateShowtimeTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new OffsetBrokenFoxyThePirateShowtimeBlockModel());
	}

	@Override
	public RenderType getRenderType(OffsetBrokenFoxyThePirateShowtimeTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
