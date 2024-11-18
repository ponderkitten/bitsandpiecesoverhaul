package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyChicaRightLegTileEntity;

public class ToyChicaRightLegBlockModel extends AnimatedGeoModel<ToyChicaRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicarightleg.png");
	}
}
