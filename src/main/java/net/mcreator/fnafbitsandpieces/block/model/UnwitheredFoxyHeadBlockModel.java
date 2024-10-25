package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredFoxyHeadTileEntity;

public class UnwitheredFoxyHeadBlockModel extends AnimatedGeoModel<UnwitheredFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyhead.png");
	}
}
