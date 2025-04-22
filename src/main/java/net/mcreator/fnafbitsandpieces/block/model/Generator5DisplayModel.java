package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Generator5DisplayItem;

public class Generator5DisplayModel extends AnimatedGeoModel<Generator5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator5DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator5DisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator5DisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genmedfuel.png");
	}
}
