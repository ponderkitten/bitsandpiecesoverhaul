package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredChicaLeftLegTileEntity;

public class UnwitheredChicaLeftLegBlockModel extends AnimatedGeoModel<UnwitheredChicaLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicaleftleg.png");
	}
}
