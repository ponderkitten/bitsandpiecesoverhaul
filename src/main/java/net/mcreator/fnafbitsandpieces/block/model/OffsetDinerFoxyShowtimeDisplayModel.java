package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerFoxyShowtimeDisplayItem;

public class OffsetDinerFoxyShowtimeDisplayModel extends AnimatedGeoModel<OffsetDinerFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeoffset.png");
	}
}
