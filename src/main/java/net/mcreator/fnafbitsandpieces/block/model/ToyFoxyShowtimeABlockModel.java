package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyFoxyShowtimeATileEntity;

public class ToyFoxyShowtimeABlockModel extends AnimatedGeoModel<ToyFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyshowtime.png");
	}
}
