package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredCatRightArmTileEntity;

public class WitheredCatRightArmBlockModel extends AnimatedGeoModel<WitheredCatRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCatRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCatRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCatRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredcatrightarm.png");
	}
}
