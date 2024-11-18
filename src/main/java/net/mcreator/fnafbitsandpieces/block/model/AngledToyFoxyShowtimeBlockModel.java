package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledToyFoxyShowtimeTileEntity;

public class AngledToyFoxyShowtimeBlockModel extends AnimatedGeoModel<AngledToyFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyshowtimeangled.png");
	}
}
