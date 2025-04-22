package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyFreddyLeftArmDisplayItem;

public class WitheredToyFreddyLeftArmDisplayModel extends AnimatedGeoModel<WitheredToyFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoyfreddyleftarm.png");
	}
}
