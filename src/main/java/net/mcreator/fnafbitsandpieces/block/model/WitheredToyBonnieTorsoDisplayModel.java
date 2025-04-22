package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyBonnieTorsoDisplayItem;

public class WitheredToyBonnieTorsoDisplayModel extends AnimatedGeoModel<WitheredToyBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoybonnietorso.png");
	}
}
