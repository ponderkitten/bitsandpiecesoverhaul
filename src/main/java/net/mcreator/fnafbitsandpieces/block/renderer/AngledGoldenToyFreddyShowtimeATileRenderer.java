package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.AngledGoldenToyFreddyShowtimeABlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.AngledGoldenToyFreddyShowtimeATileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngledGoldenToyFreddyShowtimeATileRenderer extends GeoBlockRenderer<AngledGoldenToyFreddyShowtimeATileEntity> {
	public AngledGoldenToyFreddyShowtimeATileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AngledGoldenToyFreddyShowtimeABlockModel());
	}

	@Override
	public RenderType getRenderType(AngledGoldenToyFreddyShowtimeATileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
