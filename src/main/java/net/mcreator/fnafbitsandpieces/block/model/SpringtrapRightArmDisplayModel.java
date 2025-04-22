package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringtrapRightArmDisplayItem;

public class SpringtrapRightArmDisplayModel extends AnimatedGeoModel<SpringtrapRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtraprightarm.png");
	}
}
