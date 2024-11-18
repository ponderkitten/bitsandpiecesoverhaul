package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChicaChickenShowtimeDisplayItem;

public class ChicaChickenShowtimeDisplayModel extends AnimatedGeoModel<ChicaChickenShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtime.png");
	}
}
