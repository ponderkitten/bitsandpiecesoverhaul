package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledYellowRabbitShowtimeDisplayItem;

public class AngledYellowRabbitShowtimeDisplayModel extends AnimatedGeoModel<AngledYellowRabbitShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledYellowRabbitShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledYellowRabbitShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledYellowRabbitShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtimeangled.png");
	}
}
