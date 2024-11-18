package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChicaChickenHeadDisplayItem;

public class ChicaChickenHeadDisplayModel extends AnimatedGeoModel<ChicaChickenHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenhead.png");
	}
}
