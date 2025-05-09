package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CindyRightLegTileEntity;

public class CindyRightLegBlockModel extends AnimatedGeoModel<CindyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CindyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyrightleg.png");
	}
}
