package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetGoldenToyFreddyShowtimeDisplayItem;

public class OffsetGoldenToyFreddyShowtimeDisplayModel extends AnimatedGeoModel<OffsetGoldenToyFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeoffset.png");
	}
}
