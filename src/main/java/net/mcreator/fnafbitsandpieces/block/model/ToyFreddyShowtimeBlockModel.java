package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyFreddyShowtimeTileEntity;

public class ToyFreddyShowtimeBlockModel extends AnimatedGeoModel<ToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyshowtime.png");
	}
}
