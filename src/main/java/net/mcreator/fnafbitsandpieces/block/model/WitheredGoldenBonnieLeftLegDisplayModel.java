package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredGoldenBonnieLeftLegDisplayItem;

public class WitheredGoldenBonnieLeftLegDisplayModel extends AnimatedGeoModel<WitheredGoldenBonnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenBonnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenbonnieleftleg.png");
	}
}
