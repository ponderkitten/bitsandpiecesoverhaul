package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredGoldenBonnieRightArmTileEntity;

public class WitheredGoldenBonnieRightArmBlockModel extends AnimatedGeoModel<WitheredGoldenBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenbonnierightarm.png");
	}
}
