package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadBonnieDisplayItem;

public class Endo02HeadBonnieDisplayModel extends AnimatedGeoModel<Endo02HeadBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadBonnieDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonnieendohead.png");
	}
}
