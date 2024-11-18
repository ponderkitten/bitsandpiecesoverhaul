package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.GoldenFreddyRightArmDisplayItem;

public class GoldenFreddyRightArmDisplayModel extends AnimatedGeoModel<GoldenFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldenfreddyrightarm.png");
	}
}