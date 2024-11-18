package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredCindyTorsoDisplayItem;

public class WitheredCindyTorsoDisplayModel extends AnimatedGeoModel<WitheredCindyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCindyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCindyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCindyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindytorso.png");
	}
}
