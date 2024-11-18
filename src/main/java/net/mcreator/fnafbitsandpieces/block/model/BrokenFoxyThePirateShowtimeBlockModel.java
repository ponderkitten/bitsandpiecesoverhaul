package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenFoxyThePirateShowtimeTileEntity;

public class BrokenFoxyThePirateShowtimeBlockModel extends AnimatedGeoModel<BrokenFoxyThePirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtime.png");
	}
}
