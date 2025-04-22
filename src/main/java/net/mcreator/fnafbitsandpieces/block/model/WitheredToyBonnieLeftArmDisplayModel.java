package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyBonnieLeftArmDisplayItem;

public class WitheredToyBonnieLeftArmDisplayModel extends AnimatedGeoModel<WitheredToyBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoybonnieleftarm.png");
	}
}
