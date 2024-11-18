package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CindyShowtimeDisplayItem;

public class CindyShowtimeDisplayModel extends AnimatedGeoModel<CindyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtime.png");
	}
}
