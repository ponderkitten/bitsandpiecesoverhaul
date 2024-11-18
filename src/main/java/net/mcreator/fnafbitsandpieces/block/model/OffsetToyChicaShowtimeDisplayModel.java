package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetToyChicaShowtimeDisplayItem;

public class OffsetToyChicaShowtimeDisplayModel extends AnimatedGeoModel<OffsetToyChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
