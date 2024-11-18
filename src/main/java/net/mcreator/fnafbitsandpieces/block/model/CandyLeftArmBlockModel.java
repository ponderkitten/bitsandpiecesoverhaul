package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CandyLeftArmTileEntity;

public class CandyLeftArmBlockModel extends AnimatedGeoModel<CandyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyleftarm.png");
	}
}
