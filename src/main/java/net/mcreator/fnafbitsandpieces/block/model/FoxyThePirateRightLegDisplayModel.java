package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FoxyThePirateRightLegDisplayItem;

public class FoxyThePirateRightLegDisplayModel extends AnimatedGeoModel<FoxyThePirateRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypiraterightleg.png");
	}
}
