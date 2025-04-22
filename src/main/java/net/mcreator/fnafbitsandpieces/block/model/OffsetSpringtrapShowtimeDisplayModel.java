package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetSpringtrapShowtimeDisplayItem;

public class OffsetSpringtrapShowtimeDisplayModel extends AnimatedGeoModel<OffsetSpringtrapShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringtrapShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeoffset.png");
	}
}
