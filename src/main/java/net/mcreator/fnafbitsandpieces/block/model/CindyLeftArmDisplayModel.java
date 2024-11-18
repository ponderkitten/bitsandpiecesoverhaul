package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CindyLeftArmDisplayItem;

public class CindyLeftArmDisplayModel extends AnimatedGeoModel<CindyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CindyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyleftarm.png");
	}
}
