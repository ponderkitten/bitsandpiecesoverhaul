package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerBonnieRightArmDisplayItem;

public class DinerBonnieRightArmDisplayModel extends AnimatedGeoModel<DinerBonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnierightarm.png");
	}
}
