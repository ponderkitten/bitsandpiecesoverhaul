package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledPenguinShowtimeDisplayItem;

public class AngledPenguinShowtimeDisplayModel extends AnimatedGeoModel<AngledPenguinShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledPenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledPenguinShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledPenguinShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeangled.png");
	}
}
