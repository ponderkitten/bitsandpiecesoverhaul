package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringBonnieTorsoDisplayItem;

public class SpringBonnieTorsoDisplayModel extends AnimatedGeoModel<SpringBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnietorso.png");
	}
}
