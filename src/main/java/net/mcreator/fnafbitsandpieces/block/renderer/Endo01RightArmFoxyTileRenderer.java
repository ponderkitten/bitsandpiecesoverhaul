package net.mcreator.fnafbitsandpieces.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafbitsandpieces.block.model.Endo01RightArmFoxyBlockModel;
import net.mcreator.fnafbitsandpieces.block.entity.Endo01RightArmFoxyTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01RightArmFoxyTileRenderer extends GeoBlockRenderer<Endo01RightArmFoxyTileEntity> {
	public Endo01RightArmFoxyTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new Endo01RightArmFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01RightArmFoxyTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}