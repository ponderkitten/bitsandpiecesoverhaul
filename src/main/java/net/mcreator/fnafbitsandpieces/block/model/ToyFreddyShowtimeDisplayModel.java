package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFreddyShowtimeDisplayItem;

public class ToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<ToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyshowtime.png");
	}
}
