package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredCandyRightArmTileEntity;

public class WitheredCandyRightArmBlockModel extends AnimatedGeoModel<WitheredCandyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCandyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCandyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCandyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredcandyrightarm.png");
	}
}