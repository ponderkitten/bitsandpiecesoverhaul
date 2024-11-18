package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFoxyRightLegDisplayItem;

public class ToyFoxyRightLegDisplayModel extends AnimatedGeoModel<ToyFoxyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyrightleg.png");
	}
}
