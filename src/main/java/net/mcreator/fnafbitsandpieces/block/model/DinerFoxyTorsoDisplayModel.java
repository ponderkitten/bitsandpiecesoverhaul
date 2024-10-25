package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFoxyTorsoDisplayItem;

public class DinerFoxyTorsoDisplayModel extends AnimatedGeoModel<DinerFoxyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxytorso.png");
	}
}
