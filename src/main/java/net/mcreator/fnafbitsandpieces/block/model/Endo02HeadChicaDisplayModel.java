package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadChicaDisplayItem;

public class Endo02HeadChicaDisplayModel extends AnimatedGeoModel<Endo02HeadChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadChicaDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicaendohead.png");
	}
}
