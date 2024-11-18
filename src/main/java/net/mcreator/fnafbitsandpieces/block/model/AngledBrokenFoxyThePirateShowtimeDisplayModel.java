package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledBrokenFoxyThePirateShowtimeDisplayItem;

public class AngledBrokenFoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<AngledBrokenFoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledBrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBrokenFoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeangled.png");
	}
}
