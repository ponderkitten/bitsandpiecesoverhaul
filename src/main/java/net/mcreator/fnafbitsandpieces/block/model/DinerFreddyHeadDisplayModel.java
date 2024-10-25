package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFreddyHeadDisplayItem;

public class DinerFreddyHeadDisplayModel extends AnimatedGeoModel<DinerFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyhead.png");
	}
}
