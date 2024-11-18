package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetChesterShowtimeDisplayItem;

public class OffsetChesterShowtimeDisplayModel extends AnimatedGeoModel<OffsetChesterShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetChesterShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetChesterShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetChesterShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeoffset.png");
	}
}
