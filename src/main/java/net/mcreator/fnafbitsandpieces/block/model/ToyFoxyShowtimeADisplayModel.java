package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFoxyShowtimeADisplayItem;

public class ToyFoxyShowtimeADisplayModel extends AnimatedGeoModel<ToyFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyshowtime.png");
	}
}
