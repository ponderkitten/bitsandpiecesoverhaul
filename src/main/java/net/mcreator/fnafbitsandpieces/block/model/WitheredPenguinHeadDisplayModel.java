package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredPenguinHeadDisplayItem;

public class WitheredPenguinHeadDisplayModel extends AnimatedGeoModel<WitheredPenguinHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPenguinHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPenguinHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPenguinHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredpenguinhead.png");
	}
}
