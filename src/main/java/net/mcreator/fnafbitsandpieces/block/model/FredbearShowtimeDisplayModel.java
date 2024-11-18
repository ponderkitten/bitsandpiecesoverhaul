package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FredbearShowtimeDisplayItem;

public class FredbearShowtimeDisplayModel extends AnimatedGeoModel<FredbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtime.png");
	}
}
