package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetBonnieBunnyShowtimeDisplayItem;

public class OffsetBonnieBunnyShowtimeDisplayModel extends AnimatedGeoModel<OffsetBonnieBunnyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBonnieBunnyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBonnieBunnyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBonnieBunnyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyshowtimeoffset.png");
	}
}
