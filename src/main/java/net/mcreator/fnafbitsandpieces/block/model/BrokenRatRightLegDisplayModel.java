package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenRatRightLegDisplayItem;

public class BrokenRatRightLegDisplayModel extends AnimatedGeoModel<BrokenRatRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenRatRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenRatRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenRatRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenratrightleg.png");
	}
}