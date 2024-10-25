package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredGoldenBonnieRightArmTileEntity;

public class UnwitheredGoldenBonnieRightArmBlockModel extends AnimatedGeoModel<UnwitheredGoldenBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnierightarm.png");
	}
}
