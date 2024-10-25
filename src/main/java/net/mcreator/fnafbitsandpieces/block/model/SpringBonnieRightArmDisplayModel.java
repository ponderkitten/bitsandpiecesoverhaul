package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringBonnieRightArmDisplayItem;

public class SpringBonnieRightArmDisplayModel extends AnimatedGeoModel<SpringBonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnierightarm.png");
	}
}
