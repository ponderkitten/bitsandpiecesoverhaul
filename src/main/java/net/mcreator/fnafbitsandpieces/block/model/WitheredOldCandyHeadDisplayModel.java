package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredOldCandyHeadDisplayItem;

public class WitheredOldCandyHeadDisplayModel extends AnimatedGeoModel<WitheredOldCandyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredOldCandyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredOldCandyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredOldCandyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredoldcandyhead.png");
	}
}
