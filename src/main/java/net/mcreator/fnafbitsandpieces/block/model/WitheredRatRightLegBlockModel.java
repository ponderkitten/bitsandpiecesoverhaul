package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredRatRightLegTileEntity;

public class WitheredRatRightLegBlockModel extends AnimatedGeoModel<WitheredRatRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredRatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredRatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredRatRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredratrightleg.png");
	}
}