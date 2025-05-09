package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BonnieBunnyHeadTileEntity;

public class BonnieBunnyHeadBlockModel extends AnimatedGeoModel<BonnieBunnyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyhead.png");
	}
}
