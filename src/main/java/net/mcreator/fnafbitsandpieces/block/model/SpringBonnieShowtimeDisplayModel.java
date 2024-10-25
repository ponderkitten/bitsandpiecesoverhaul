package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringBonnieShowtimeDisplayItem;

public class SpringBonnieShowtimeDisplayModel extends AnimatedGeoModel<SpringBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnie.png");
	}
}
