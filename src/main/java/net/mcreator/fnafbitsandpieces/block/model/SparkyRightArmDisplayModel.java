package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SparkyRightArmDisplayItem;

public class SparkyRightArmDisplayModel extends AnimatedGeoModel<SparkyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SparkyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/sparkyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/sparkyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/sparkyrightarm.png");
	}
}
