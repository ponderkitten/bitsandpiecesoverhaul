package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredGoldenBonnieRightLegTileEntity;

public class WitheredGoldenBonnieRightLegBlockModel extends AnimatedGeoModel<WitheredGoldenBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenbonnierightleg.png");
	}
}
