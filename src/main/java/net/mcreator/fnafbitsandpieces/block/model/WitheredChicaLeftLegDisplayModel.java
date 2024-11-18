package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChicaLeftLegDisplayItem;

public class WitheredChicaLeftLegDisplayModel extends AnimatedGeoModel<WitheredChicaLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchicaleftleg.png");
	}
}
