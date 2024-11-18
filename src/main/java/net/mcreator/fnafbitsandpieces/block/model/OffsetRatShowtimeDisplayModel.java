package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetRatShowtimeDisplayItem;

public class OffsetRatShowtimeDisplayModel extends AnimatedGeoModel<OffsetRatShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetRatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetRatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetRatShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeoffset.png");
	}
}
