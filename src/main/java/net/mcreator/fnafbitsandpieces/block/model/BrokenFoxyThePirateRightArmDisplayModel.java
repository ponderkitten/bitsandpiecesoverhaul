package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.BrokenFoxyThePirateRightArmDisplayItem;

public class BrokenFoxyThePirateRightArmDisplayModel extends AnimatedGeoModel<BrokenFoxyThePirateRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypiraterightarm.png");
	}
}
