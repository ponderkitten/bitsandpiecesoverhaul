package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.GoldenToyFreddyRightArmDisplayItem;

public class GoldenToyFreddyRightArmDisplayModel extends AnimatedGeoModel<GoldenToyFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyrightarm.png");
	}
}
