package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredGoldenFreddyHeadTileEntity;

public class WitheredGoldenFreddyHeadBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenfreddyhead.png");
	}
}