package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredbearRightArmTileEntity;

public class FredbearRightArmBlockModel extends AnimatedGeoModel<FredbearRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearrightarm.png");
	}
}
