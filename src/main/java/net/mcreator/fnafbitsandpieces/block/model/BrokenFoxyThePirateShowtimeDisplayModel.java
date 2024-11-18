package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenFoxyThePirateShowtimeDisplayItem;

public class BrokenFoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<BrokenFoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtime.png");
	}
}
