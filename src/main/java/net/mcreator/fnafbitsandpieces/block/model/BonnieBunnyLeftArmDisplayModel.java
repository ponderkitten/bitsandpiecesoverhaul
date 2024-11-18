package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BonnieBunnyLeftArmDisplayItem;

public class BonnieBunnyLeftArmDisplayModel extends AnimatedGeoModel<BonnieBunnyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyleftarm.png");
	}
}
