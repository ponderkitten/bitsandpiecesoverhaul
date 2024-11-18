package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenCatRightArmTileEntity;

public class BrokenCatRightArmBlockModel extends AnimatedGeoModel<BrokenCatRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenCatRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenCatRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenCatRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/catrightarm.png");
	}
}