package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FoxyThePirateShowtimeDisplayItem;

public class FoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<FoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtime.png");
	}
}
