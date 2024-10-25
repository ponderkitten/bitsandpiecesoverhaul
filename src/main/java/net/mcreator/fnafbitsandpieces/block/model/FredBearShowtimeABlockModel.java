package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredBearShowtimeATileEntity;

public class FredBearShowtimeABlockModel extends AnimatedGeoModel<FredBearShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbear4.png");
	}
}
