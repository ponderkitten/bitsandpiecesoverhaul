package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.RatShowtimeTileEntity;

public class RatShowtimeBlockModel extends AnimatedGeoModel<RatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtime.png");
	}
}
