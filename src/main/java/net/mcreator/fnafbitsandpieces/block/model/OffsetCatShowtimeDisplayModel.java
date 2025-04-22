package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetCatShowtimeDisplayItem;

public class OffsetCatShowtimeDisplayModel extends AnimatedGeoModel<OffsetCatShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCatShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeoffset.png");
	}
}
