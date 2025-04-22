package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OldCandyLeftArmDisplayItem;

public class OldCandyLeftArmDisplayModel extends AnimatedGeoModel<OldCandyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldCandyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldCandyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldCandyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/oldcandyleftarm.png");
	}
}
