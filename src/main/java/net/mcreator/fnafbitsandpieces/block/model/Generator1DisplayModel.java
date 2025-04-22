package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator1DisplayItem;

public class Generator1DisplayModel extends AnimatedGeoModel<Generator1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator1DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator1DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator1DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genlowfuel.png");
	}
}
