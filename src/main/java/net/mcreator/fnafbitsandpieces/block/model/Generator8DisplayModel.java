package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator8DisplayItem;

public class Generator8DisplayModel extends AnimatedGeoModel<Generator8DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator8DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator8.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator8DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator8.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator8DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genhighfuel.png");
	}
}
