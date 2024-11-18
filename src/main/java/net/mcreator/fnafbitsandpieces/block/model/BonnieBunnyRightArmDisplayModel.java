package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BonnieBunnyRightArmDisplayItem;

public class BonnieBunnyRightArmDisplayModel extends AnimatedGeoModel<BonnieBunnyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyrightarm.png");
	}
}