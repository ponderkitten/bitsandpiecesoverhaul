package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenFoxyThePirateLeftLegDisplayItem;

public class BrokenFoxyThePirateLeftLegDisplayModel extends AnimatedGeoModel<BrokenFoxyThePirateLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateleftleg.png");
	}
}
