package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledGoldenToyFreddyShowtimeDisplayItem;

public class AngledGoldenToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<AngledGoldenToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeangled.png");
	}
}
