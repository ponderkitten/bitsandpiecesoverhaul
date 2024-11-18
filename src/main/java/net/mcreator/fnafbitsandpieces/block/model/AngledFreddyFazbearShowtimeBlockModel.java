package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledFreddyFazbearShowtimeTileEntity;

public class AngledFreddyFazbearShowtimeBlockModel extends AnimatedGeoModel<AngledFreddyFazbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFreddyFazbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyhead.png");
	}
}
