package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyChicaRightArmTileEntity;

public class ToyChicaRightArmBlockModel extends AnimatedGeoModel<ToyChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicarightarm.png");
	}
}