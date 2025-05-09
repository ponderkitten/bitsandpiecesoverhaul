package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFoxyShowtimeDisplayItem;

public class UnwitheredFoxyShowtimeDisplayModel extends AnimatedGeoModel<UnwitheredFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtime.png");
	}
}
