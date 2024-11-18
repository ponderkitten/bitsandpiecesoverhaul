package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledGoldenToyBonnieShowtimeDisplayItem;

public class AngledGoldenToyBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledGoldenToyBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnieshowtimeangled.png");
	}
}
