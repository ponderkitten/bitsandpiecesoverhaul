package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyFreddyRightArmDisplayItem;

public class WitheredToyFreddyRightArmDisplayModel extends AnimatedGeoModel<WitheredToyFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoyfreddyrightarm.png");
	}
}
