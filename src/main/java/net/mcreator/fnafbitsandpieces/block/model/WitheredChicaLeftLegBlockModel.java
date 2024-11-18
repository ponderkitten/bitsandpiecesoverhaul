package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredChicaLeftLegTileEntity;

public class WitheredChicaLeftLegBlockModel extends AnimatedGeoModel<WitheredChicaLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchicaleftleg.png");
	}
}
