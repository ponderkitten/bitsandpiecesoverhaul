package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringtrapTorsoDisplayItem;

public class SpringtrapTorsoDisplayModel extends AnimatedGeoModel<SpringtrapTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtraptorso.png");
	}
}
