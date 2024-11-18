package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CandyRightArmDisplayItem;

public class CandyRightArmDisplayModel extends AnimatedGeoModel<CandyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyrightarm.png");
	}
}
