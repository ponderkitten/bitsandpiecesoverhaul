package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenBonnieTorsoDisplayItem;

public class UnwitheredGoldenBonnieTorsoDisplayModel extends AnimatedGeoModel<UnwitheredGoldenBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnietorso.png");
	}
}
