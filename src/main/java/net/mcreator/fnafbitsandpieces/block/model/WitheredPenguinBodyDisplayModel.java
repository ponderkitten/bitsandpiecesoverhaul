package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredPenguinBodyDisplayItem;

public class WitheredPenguinBodyDisplayModel extends AnimatedGeoModel<WitheredPenguinBodyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPenguinBodyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPenguinBodyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPenguinBodyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredpenguinbody.png");
	}
}
