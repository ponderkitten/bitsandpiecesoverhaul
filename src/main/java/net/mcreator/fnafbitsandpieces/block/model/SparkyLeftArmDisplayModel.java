package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SparkyLeftArmDisplayItem;

public class SparkyLeftArmDisplayModel extends AnimatedGeoModel<SparkyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SparkyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/sparkyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/sparkyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/sparkyleftarm.png");
	}
}
