package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringtrapLeftLegDisplayItem;

public class SpringtrapLeftLegDisplayModel extends AnimatedGeoModel<SpringtrapLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapleftleg.png");
	}
}
