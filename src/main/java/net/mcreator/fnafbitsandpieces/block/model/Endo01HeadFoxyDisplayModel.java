package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01HeadFoxyDisplayItem;

public class Endo01HeadFoxyDisplayModel extends AnimatedGeoModel<Endo01HeadFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01headfoxy.png");
	}
}
