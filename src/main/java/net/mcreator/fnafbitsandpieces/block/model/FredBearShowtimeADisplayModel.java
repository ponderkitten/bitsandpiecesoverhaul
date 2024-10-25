package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FredBearShowtimeADisplayItem;

public class FredBearShowtimeADisplayModel extends AnimatedGeoModel<FredBearShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbear4.png");
	}
}
