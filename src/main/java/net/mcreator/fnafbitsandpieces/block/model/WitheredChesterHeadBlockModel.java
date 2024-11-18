package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredChesterHeadTileEntity;

public class WitheredChesterHeadBlockModel extends AnimatedGeoModel<WitheredChesterHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChesterHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChesterHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChesterHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchesterhead.png");
	}
}
