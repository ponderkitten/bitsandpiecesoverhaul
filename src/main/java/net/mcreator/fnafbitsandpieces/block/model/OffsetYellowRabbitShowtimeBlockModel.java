package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetYellowRabbitShowtimeTileEntity;

public class OffsetYellowRabbitShowtimeBlockModel extends AnimatedGeoModel<OffsetYellowRabbitShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowRabbitShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowRabbitShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowRabbitShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtimeoffset.png");
	}
}