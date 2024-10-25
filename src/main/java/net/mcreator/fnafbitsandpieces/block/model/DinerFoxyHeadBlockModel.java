package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFoxyHeadTileEntity;

public class DinerFoxyHeadBlockModel extends AnimatedGeoModel<DinerFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyhead.png");
	}
}
