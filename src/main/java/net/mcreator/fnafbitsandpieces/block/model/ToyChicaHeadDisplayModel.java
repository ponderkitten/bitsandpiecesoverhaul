package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyChicaHeadDisplayItem;

public class ToyChicaHeadDisplayModel extends AnimatedGeoModel<ToyChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicahead.png");
	}
}
