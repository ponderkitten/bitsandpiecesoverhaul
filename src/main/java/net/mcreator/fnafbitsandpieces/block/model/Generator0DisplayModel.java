package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator0DisplayItem;

public class Generator0DisplayModel extends AnimatedGeoModel<Generator0DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator0DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator0DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator0DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/generator.png");
	}
}
