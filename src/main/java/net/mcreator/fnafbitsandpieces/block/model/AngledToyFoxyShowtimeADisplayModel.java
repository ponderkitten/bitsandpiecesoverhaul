package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledToyFoxyShowtimeADisplayItem;

public class AngledToyFoxyShowtimeADisplayModel extends AnimatedGeoModel<AngledToyFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyshowtimeangled.png");
	}
}
