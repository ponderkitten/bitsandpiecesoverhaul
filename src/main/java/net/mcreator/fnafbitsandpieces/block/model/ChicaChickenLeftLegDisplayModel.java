package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChicaChickenLeftLegDisplayItem;

public class ChicaChickenLeftLegDisplayModel extends AnimatedGeoModel<ChicaChickenLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenleftleg.png");
	}
}
