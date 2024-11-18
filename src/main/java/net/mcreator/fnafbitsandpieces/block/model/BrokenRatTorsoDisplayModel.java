package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenRatTorsoDisplayItem;

public class BrokenRatTorsoDisplayModel extends AnimatedGeoModel<BrokenRatTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenRatTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenRatTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenRatTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenrattorso.png");
	}
}
