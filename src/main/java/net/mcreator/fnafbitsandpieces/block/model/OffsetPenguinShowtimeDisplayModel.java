package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetPenguinShowtimeDisplayItem;

public class OffsetPenguinShowtimeDisplayModel extends AnimatedGeoModel<OffsetPenguinShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetPenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetPenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetPenguinShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeoffset.png");
	}
}
