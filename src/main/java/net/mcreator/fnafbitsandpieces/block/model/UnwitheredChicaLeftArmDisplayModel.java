package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredChicaLeftArmDisplayItem;

public class UnwitheredChicaLeftArmDisplayModel extends AnimatedGeoModel<UnwitheredChicaLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicaleftarm.png");
	}
}
