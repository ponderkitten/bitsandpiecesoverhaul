package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FoxyThePirateLeftArmDisplayItem;

public class FoxyThePirateLeftArmDisplayModel extends AnimatedGeoModel<FoxyThePirateLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateleftarm.png");
	}
}
