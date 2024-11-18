package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenCatTorsoDisplayItem;

public class BrokenCatTorsoDisplayModel extends AnimatedGeoModel<BrokenCatTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenCatTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenCatTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenCatTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cattorso.png");
	}
}
