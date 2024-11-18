package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyFreddyRightArmDisplayItem;

public class ToyFreddyRightArmDisplayModel extends AnimatedGeoModel<ToyFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyrightarm.png");
	}
}
