package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CandyShowtimeDisplayItem;

public class CandyShowtimeDisplayModel extends AnimatedGeoModel<CandyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtime.png");
	}
}
