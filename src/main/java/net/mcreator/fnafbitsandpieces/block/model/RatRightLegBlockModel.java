package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.RatRightLegTileEntity;

public class RatRightLegBlockModel extends AnimatedGeoModel<RatRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratrightleg.png");
	}
}
