package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.AngledUnwitheredFoxyShowtimeABlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredFoxyShowtimeATileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngledUnwitheredFoxyShowtimeATileRenderer extends GeoBlockRenderer<AngledUnwitheredFoxyShowtimeATileEntity> {
	public AngledUnwitheredFoxyShowtimeATileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AngledUnwitheredFoxyShowtimeABlockModel());
	}

	@Override
	public RenderType getRenderType(AngledUnwitheredFoxyShowtimeATileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}