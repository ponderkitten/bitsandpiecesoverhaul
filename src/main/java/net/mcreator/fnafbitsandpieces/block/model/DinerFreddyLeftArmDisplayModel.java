package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFreddyLeftArmDisplayItem;

public class DinerFreddyLeftArmDisplayModel extends AnimatedGeoModel<DinerFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyleftarm.png");
	}
}
