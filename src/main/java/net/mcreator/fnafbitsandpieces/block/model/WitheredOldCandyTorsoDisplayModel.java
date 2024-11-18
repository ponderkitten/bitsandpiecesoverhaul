package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredOldCandyTorsoDisplayItem;

public class WitheredOldCandyTorsoDisplayModel extends AnimatedGeoModel<WitheredOldCandyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredOldCandyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredOldCandyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredOldCandyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredoldcandytorso.png");
	}
}
