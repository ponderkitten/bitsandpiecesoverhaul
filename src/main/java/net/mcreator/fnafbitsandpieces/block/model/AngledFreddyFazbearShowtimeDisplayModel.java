package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledFreddyFazbearShowtimeDisplayItem;

public class AngledFreddyFazbearShowtimeDisplayModel extends AnimatedGeoModel<AngledFreddyFazbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFreddyFazbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearshowtimeangled.png");
	}
}
