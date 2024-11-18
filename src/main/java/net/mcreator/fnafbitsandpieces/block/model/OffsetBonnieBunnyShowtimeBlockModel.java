package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetBonnieBunnyShowtimeTileEntity;

public class OffsetBonnieBunnyShowtimeBlockModel extends AnimatedGeoModel<OffsetBonnieBunnyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBonnieBunnyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBonnieBunnyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBonnieBunnyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyshowtimeoffset.png");
	}
}
