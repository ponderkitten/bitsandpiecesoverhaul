package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.RatShowtimeDisplayItem;

public class RatShowtimeDisplayModel extends AnimatedGeoModel<RatShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtime.png");
	}
}
