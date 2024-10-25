package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFreddyRightLegDisplayItem;

public class DinerFreddyRightLegDisplayModel extends AnimatedGeoModel<DinerFreddyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyrightleg.png");
	}
}
