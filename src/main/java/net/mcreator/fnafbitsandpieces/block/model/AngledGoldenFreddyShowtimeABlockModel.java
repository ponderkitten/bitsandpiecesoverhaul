package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledGoldenFreddyShowtimeATileEntity;

public class AngledGoldenFreddyShowtimeABlockModel extends AnimatedGeoModel<AngledGoldenFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldenfreddyshowtimeangled.png");
	}
}
