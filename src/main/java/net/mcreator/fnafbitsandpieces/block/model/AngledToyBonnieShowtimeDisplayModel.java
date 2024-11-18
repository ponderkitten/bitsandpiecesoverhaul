package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledToyBonnieShowtimeDisplayItem;

public class AngledToyBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledToyBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnieshowtimeangled.png");
	}
}
