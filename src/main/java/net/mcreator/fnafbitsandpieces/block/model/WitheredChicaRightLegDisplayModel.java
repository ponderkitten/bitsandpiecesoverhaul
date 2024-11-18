package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChicaRightLegDisplayItem;

public class WitheredChicaRightLegDisplayModel extends AnimatedGeoModel<WitheredChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchicarightleg.png");
	}
}
