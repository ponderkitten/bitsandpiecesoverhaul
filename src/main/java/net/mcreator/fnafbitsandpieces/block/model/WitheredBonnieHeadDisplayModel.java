package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredBonnieHeadDisplayItem;

public class WitheredBonnieHeadDisplayModel extends AnimatedGeoModel<WitheredBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredbonniehead.png");
	}
}
