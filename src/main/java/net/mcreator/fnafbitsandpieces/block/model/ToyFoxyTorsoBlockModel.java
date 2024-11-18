package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyFoxyTorsoTileEntity;

public class ToyFoxyTorsoBlockModel extends AnimatedGeoModel<ToyFoxyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxytorso.png");
	}
}
