package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyChicaLeftArmDisplayItem;

public class WitheredToyChicaLeftArmDisplayModel extends AnimatedGeoModel<WitheredToyChicaLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyChicaLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoychicaleftarm.png");
	}
}
