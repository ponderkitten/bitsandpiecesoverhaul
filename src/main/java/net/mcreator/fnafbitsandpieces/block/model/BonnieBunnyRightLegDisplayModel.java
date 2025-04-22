package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BonnieBunnyRightLegDisplayItem;

public class BonnieBunnyRightLegDisplayModel extends AnimatedGeoModel<BonnieBunnyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyrightleg.png");
	}
}
