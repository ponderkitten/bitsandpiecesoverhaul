package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredOldCandyRightArmTileEntity;

public class WitheredOldCandyRightArmBlockModel extends AnimatedGeoModel<WitheredOldCandyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredOldCandyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredOldCandyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredOldCandyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredoldcandyrightarm.png");
	}
}
