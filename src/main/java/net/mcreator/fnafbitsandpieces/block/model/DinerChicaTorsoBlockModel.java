package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerChicaTorsoTileEntity;

public class DinerChicaTorsoBlockModel extends AnimatedGeoModel<DinerChicaTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicatorso.png");
	}
}
