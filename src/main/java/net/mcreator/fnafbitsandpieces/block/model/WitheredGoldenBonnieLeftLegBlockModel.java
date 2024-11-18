package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredGoldenBonnieLeftLegTileEntity;

public class WitheredGoldenBonnieLeftLegBlockModel extends AnimatedGeoModel<WitheredGoldenBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenbonnieleftleg.png");
	}
}
