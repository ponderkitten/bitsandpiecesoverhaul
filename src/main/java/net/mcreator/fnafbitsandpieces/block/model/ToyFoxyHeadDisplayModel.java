package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFoxyHeadDisplayItem;

public class ToyFoxyHeadDisplayModel extends AnimatedGeoModel<ToyFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfoxyhead.png");
	}
}
