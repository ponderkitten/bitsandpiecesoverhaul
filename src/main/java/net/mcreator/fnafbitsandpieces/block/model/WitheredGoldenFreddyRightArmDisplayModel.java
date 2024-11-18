package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredGoldenFreddyRightArmDisplayItem;

public class WitheredGoldenFreddyRightArmDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenfreddyrightarm.png");
	}
}
