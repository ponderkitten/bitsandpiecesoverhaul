package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01HeadTileEntity;

public class Endo01HeadBlockModel extends AnimatedGeoModel<Endo01HeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/endo01parts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/endo01parts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01head.png");
	}
}
