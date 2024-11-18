package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PenguinHeadTileEntity;

public class PenguinHeadBlockModel extends AnimatedGeoModel<PenguinHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PenguinHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinhead.png");
	}
}
