package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredCandyLeftArmDisplayItem;

public class WitheredCandyLeftArmDisplayModel extends AnimatedGeoModel<WitheredCandyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCandyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCandyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCandyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredcandylefthand.png");
	}
}
