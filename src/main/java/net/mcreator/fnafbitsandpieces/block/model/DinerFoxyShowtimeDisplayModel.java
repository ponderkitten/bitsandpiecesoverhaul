package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFoxyShowtimeDisplayItem;

public class DinerFoxyShowtimeDisplayModel extends AnimatedGeoModel<DinerFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtime.png");
	}
}
