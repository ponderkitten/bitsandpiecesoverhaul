package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenFreddyTorsoDisplayItem;

public class UnwitheredGoldenFreddyTorsoDisplayModel extends AnimatedGeoModel<UnwitheredGoldenFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddytorso.png");
	}
}
