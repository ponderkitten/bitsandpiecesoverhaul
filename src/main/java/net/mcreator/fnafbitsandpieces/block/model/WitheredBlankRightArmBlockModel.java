package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredBlankRightArmTileEntity;

public class WitheredBlankRightArmBlockModel extends AnimatedGeoModel<WitheredBlankRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBlankRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/blankparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBlankRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/blankparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBlankRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredblankrightarm.png");
	}
}
