package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyFoxyRightArmTileEntity;

public class ToyFoxyRightArmBlockModel extends AnimatedGeoModel<ToyFoxyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyrightarm.png");
	}
}
