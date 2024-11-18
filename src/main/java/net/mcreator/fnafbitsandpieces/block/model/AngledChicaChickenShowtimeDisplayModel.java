package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledChicaChickenShowtimeDisplayItem;

public class AngledChicaChickenShowtimeDisplayModel extends AnimatedGeoModel<AngledChicaChickenShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChicaChickenShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeangled.png");
	}
}
