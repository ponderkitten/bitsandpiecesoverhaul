package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CindyRightArmTileEntity;

public class CindyRightArmBlockModel extends AnimatedGeoModel<CindyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CindyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyrightarm.png");
	}
}
