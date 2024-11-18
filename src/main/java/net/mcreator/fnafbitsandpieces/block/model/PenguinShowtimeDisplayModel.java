package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PenguinShowtimeDisplayItem;

public class PenguinShowtimeDisplayModel extends AnimatedGeoModel<PenguinShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtime.png");
	}
}
