package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredChicaHeadDisplayItem;

public class UnwitheredChicaHeadDisplayModel extends AnimatedGeoModel<UnwitheredChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicahead.png");
	}
}
