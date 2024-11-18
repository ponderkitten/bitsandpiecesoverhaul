package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01RightArmFoxyDisplayItem;

public class Endo01RightArmFoxyDisplayModel extends AnimatedGeoModel<Endo01RightArmFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightArmFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightArmFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightArmFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01rightarmfoxy.png");
	}
}
