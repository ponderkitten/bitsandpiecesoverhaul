package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenRatRightLegTileEntity;

public class BrokenRatRightLegBlockModel extends AnimatedGeoModel<BrokenRatRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenRatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenRatRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenRatRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenratrightleg.png");
	}
}
