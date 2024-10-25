package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFoxyShowtimeTileEntity;

public class DinerFoxyShowtimeBlockModel extends AnimatedGeoModel<DinerFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtime.png");
	}
}
