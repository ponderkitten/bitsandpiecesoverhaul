package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenBonnieLeftArmDisplayItem;

public class UnwitheredGoldenBonnieLeftArmDisplayModel extends AnimatedGeoModel<UnwitheredGoldenBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieleftarm.png");
	}
}
