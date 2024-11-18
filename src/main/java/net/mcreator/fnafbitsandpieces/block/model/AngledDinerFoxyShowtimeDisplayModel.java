package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerFoxyShowtimeDisplayItem;

public class AngledDinerFoxyShowtimeDisplayModel extends AnimatedGeoModel<AngledDinerFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeangled.png");
	}
}
