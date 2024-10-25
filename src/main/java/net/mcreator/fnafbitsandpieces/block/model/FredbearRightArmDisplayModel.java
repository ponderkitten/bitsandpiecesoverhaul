package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FredbearRightArmDisplayItem;

public class FredbearRightArmDisplayModel extends AnimatedGeoModel<FredbearRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearrightarm.png");
	}
}
