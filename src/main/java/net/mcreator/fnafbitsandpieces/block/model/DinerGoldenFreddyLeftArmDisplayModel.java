package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerGoldenFreddyLeftArmDisplayItem;

public class DinerGoldenFreddyLeftArmDisplayModel extends AnimatedGeoModel<DinerGoldenFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerGoldenFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerGoldenFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerGoldenFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyleftarm.png");
	}
}
