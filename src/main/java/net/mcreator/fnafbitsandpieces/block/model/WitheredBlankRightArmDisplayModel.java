package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredBlankRightArmDisplayItem;

public class WitheredBlankRightArmDisplayModel extends AnimatedGeoModel<WitheredBlankRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBlankRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/blankparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBlankRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/blankparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBlankRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredblankrightarm.png");
	}
}