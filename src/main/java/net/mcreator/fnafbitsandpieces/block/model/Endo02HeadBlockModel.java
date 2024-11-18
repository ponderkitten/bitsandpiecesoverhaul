package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02HeadTileEntity;

public class Endo02HeadBlockModel extends AnimatedGeoModel<Endo02HeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerendoparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerendoparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02head.png");
	}
}
