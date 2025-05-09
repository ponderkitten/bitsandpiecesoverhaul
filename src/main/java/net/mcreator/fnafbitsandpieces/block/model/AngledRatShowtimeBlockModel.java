package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledRatShowtimeTileEntity;

public class AngledRatShowtimeBlockModel extends AnimatedGeoModel<AngledRatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledRatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledRatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledRatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeangled.png");
	}
}
