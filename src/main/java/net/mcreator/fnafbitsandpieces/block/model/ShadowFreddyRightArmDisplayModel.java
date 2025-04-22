package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ShadowFreddyRightArmDisplayItem;

public class ShadowFreddyRightArmDisplayModel extends AnimatedGeoModel<ShadowFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShadowFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowfreddyrightarm.png");
	}
}
