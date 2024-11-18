package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BlankHeadTileEntity;

public class BlankHeadBlockModel extends AnimatedGeoModel<BlankHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlankHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/blankparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlankHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/blankparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlankHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/blankhead.png");
	}
}
