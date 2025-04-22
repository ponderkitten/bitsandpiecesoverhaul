package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator7DisplayItem;

public class Generator7DisplayModel extends AnimatedGeoModel<Generator7DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator7DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator7DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator7DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genhighfuel.png");
	}
}
