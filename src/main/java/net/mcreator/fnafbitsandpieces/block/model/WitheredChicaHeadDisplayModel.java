package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChicaHeadDisplayItem;

public class WitheredChicaHeadDisplayModel extends AnimatedGeoModel<WitheredChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchicahead.png");
	}
}
