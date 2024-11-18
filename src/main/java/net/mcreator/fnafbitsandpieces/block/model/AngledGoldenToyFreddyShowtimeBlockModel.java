package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledGoldenToyFreddyShowtimeTileEntity;

public class AngledGoldenToyFreddyShowtimeBlockModel extends AnimatedGeoModel<AngledGoldenToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeangled.png");
	}
}
