package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01HeadBonnieDisplayItem;

public class Endo01HeadBonnieDisplayModel extends AnimatedGeoModel<Endo01HeadBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadBonnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadBonnieDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01headbonnie.png");
	}
}
