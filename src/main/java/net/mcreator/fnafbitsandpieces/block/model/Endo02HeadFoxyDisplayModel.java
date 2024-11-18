package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadFoxyDisplayItem;

public class Endo02HeadFoxyDisplayModel extends AnimatedGeoModel<Endo02HeadFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxyendohead.png");
	}
}
