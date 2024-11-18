package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetYellowRabbitShowtimeDisplayItem;

public class OffsetYellowRabbitShowtimeDisplayModel extends AnimatedGeoModel<OffsetYellowRabbitShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowRabbitShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowRabbitShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowRabbitShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtimeoffset.png");
	}
}
