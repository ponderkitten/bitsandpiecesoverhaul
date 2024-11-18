package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredOldCandyRightArmDisplayItem;

public class WitheredOldCandyRightArmDisplayModel extends AnimatedGeoModel<WitheredOldCandyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredOldCandyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredOldCandyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredOldCandyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredoldcandyrightarm.png");
	}
}
