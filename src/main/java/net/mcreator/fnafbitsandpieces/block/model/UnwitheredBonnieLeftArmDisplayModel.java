package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredBonnieLeftArmDisplayItem;

public class UnwitheredBonnieLeftArmDisplayModel extends AnimatedGeoModel<UnwitheredBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieleftarm.png");
	}
}
