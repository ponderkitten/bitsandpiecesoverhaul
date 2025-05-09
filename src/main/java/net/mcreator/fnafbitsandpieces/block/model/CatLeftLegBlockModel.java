package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CatLeftLegTileEntity;

public class CatLeftLegBlockModel extends AnimatedGeoModel<CatLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatleftleg.png");
	}
}
