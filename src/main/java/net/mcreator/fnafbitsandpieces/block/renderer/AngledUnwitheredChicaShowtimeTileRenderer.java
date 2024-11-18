package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.AngledUnwitheredChicaShowtimeBlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredChicaShowtimeTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngledUnwitheredChicaShowtimeTileRenderer extends GeoBlockRenderer<AngledUnwitheredChicaShowtimeTileEntity> {
	public AngledUnwitheredChicaShowtimeTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AngledUnwitheredChicaShowtimeBlockModel());
	}

	@Override
	public RenderType getRenderType(AngledUnwitheredChicaShowtimeTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
