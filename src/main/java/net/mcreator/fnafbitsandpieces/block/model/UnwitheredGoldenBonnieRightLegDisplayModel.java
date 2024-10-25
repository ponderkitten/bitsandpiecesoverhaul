package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenBonnieRightLegDisplayItem;

public class UnwitheredGoldenBonnieRightLegDisplayModel extends AnimatedGeoModel<UnwitheredGoldenBonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnierightleg.png");
	}
}
