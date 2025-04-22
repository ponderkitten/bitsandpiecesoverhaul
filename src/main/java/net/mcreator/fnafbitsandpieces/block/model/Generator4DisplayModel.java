package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator4DisplayItem;

public class Generator4DisplayModel extends AnimatedGeoModel<Generator4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator4DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator4DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator4DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genmedfuel.png");
	}
}
