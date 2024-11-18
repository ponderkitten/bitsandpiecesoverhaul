package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredRatTorsoTileEntity;

public class WitheredRatTorsoBlockModel extends AnimatedGeoModel<WitheredRatTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredRatTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredRatTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredRatTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredrattorso.png");
	}
}
