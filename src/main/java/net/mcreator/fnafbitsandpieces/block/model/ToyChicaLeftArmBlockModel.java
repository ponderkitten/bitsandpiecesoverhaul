package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyChicaLeftArmTileEntity;

public class ToyChicaLeftArmBlockModel extends AnimatedGeoModel<ToyChicaLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicaleftarm.png");
	}
}
