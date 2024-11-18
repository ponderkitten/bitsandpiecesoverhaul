package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BlankLeftArmDisplayItem;

public class BlankLeftArmDisplayModel extends AnimatedGeoModel<BlankLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlankLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/blankparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlankLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/blankparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlankLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/blankleftarm.png");
	}
}
