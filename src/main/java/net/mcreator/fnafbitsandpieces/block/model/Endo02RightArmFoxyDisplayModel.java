package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo02RightArmFoxyDisplayItem;

public class Endo02RightArmFoxyDisplayModel extends AnimatedGeoModel<Endo02RightArmFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightArmFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightArmFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightArmFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02rightarmfoxy.png");
	}
}
