package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFoxyTorsoDisplayItem;

public class ToyFoxyTorsoDisplayModel extends AnimatedGeoModel<ToyFoxyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxytorso.png");
	}
}
