package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyChicaShowtimeDisplayItem;

public class ToyChicaShowtimeDisplayModel extends AnimatedGeoModel<ToyChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtime.png");
	}
}
