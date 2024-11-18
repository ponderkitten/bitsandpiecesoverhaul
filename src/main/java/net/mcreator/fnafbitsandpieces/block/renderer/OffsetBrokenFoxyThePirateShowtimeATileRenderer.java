package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.OffsetBrokenFoxyThePirateShowtimeABlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.OffsetBrokenFoxyThePirateShowtimeATileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OffsetBrokenFoxyThePirateShowtimeATileRenderer extends GeoBlockRenderer<OffsetBrokenFoxyThePirateShowtimeATileEntity> {
	public OffsetBrokenFoxyThePirateShowtimeATileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new OffsetBrokenFoxyThePirateShowtimeABlockModel());
	}

	@Override
	public RenderType getRenderType(OffsetBrokenFoxyThePirateShowtimeATileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
