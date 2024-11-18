package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledToyChicaShowtimeDisplayItem;

public class AngledToyChicaShowtimeDisplayModel extends AnimatedGeoModel<AngledToyChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeangled.png");
	}
}
