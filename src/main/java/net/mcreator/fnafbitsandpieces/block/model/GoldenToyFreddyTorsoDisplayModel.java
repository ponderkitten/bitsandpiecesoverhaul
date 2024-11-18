package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.GoldenToyFreddyTorsoDisplayItem;

public class GoldenToyFreddyTorsoDisplayModel extends AnimatedGeoModel<GoldenToyFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddytorso.png");
	}
}
