package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01HeadBonnieTileEntity;

public class Endo01HeadBonnieBlockModel extends AnimatedGeoModel<Endo01HeadBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadBonnieTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01headbonnie.png");
	}
}
