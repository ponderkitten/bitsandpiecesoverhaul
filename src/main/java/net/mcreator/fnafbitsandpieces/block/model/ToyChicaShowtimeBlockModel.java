package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyChicaShowtimeTileEntity;

public class ToyChicaShowtimeBlockModel extends AnimatedGeoModel<ToyChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtime.png");
	}
}
