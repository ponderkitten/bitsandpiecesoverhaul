package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledYellowBearShowtimeDisplayItem;

public class AngledYellowBearShowtimeDisplayModel extends AnimatedGeoModel<AngledYellowBearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledYellowBearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbearshowtimeangled.png");
	}
}
