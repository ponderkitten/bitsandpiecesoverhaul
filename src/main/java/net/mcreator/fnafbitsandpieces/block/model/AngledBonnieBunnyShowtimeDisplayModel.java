package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledBonnieBunnyShowtimeDisplayItem;

public class AngledBonnieBunnyShowtimeDisplayModel extends AnimatedGeoModel<AngledBonnieBunnyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledBonnieBunnyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBonnieBunnyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBonnieBunnyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyshowtimeangled.png");
	}
}
