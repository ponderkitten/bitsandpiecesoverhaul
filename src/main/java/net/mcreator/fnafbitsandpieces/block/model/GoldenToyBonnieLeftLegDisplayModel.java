package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.GoldenToyBonnieLeftLegDisplayItem;

public class GoldenToyBonnieLeftLegDisplayModel extends AnimatedGeoModel<GoldenToyBonnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyBonnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnieleftleg.png");
	}
}