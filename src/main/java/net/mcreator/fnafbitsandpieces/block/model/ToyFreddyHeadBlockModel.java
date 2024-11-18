package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyFreddyHeadTileEntity;

public class ToyFreddyHeadBlockModel extends AnimatedGeoModel<ToyFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyhead.png");
	}
}
