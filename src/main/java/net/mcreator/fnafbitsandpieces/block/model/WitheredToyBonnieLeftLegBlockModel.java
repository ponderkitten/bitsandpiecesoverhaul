package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyBonnieLeftLegTileEntity;

public class WitheredToyBonnieLeftLegBlockModel extends AnimatedGeoModel<WitheredToyBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoybonnieleftleg.png");
	}
}
