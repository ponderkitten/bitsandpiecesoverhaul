package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledToyFoxyShowtimeATileEntity;

public class AngledToyFoxyShowtimeABlockModel extends AnimatedGeoModel<AngledToyFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyshowtimeangled.png");
	}
}
