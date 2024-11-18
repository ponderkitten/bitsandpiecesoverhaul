package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FoxyThePirateShowtimeTileEntity;

public class FoxyThePirateShowtimeBlockModel extends AnimatedGeoModel<FoxyThePirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtime.png");
	}
}
