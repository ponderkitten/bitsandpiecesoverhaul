package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledChesterShowtimeTileEntity;

public class AngledChesterShowtimeBlockModel extends AnimatedGeoModel<AngledChesterShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledChesterShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChesterShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChesterShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeangled.png");
	}
}
