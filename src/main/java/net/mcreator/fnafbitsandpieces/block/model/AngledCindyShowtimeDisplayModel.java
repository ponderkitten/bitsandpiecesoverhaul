package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCindyShowtimeDisplayItem;

public class AngledCindyShowtimeDisplayModel extends AnimatedGeoModel<AngledCindyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCindyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeangled.png");
	}
}
