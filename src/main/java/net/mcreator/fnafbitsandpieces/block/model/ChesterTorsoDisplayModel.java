package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChesterTorsoDisplayItem;

public class ChesterTorsoDisplayModel extends AnimatedGeoModel<ChesterTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChesterTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChesterTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChesterTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestertorso.png");
	}
}
