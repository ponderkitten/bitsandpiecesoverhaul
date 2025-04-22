package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator2DisplayItem;

public class Generator2DisplayModel extends AnimatedGeoModel<Generator2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator2DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator2DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator2DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genlowfuel.png");
	}
}
