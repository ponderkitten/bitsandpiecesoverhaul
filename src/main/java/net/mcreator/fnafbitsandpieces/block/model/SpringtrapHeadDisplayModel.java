package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringtrapHeadDisplayItem;

public class SpringtrapHeadDisplayModel extends AnimatedGeoModel<SpringtrapHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtraphead.png");
	}
}
