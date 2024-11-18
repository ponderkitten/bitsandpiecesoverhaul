package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyChicaRightLegDisplayItem;

public class ToyChicaRightLegDisplayModel extends AnimatedGeoModel<ToyChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicarightleg.png");
	}
}
