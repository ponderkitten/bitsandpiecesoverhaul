package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PenguinShowtimeTileEntity;

public class PenguinShowtimeBlockModel extends AnimatedGeoModel<PenguinShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PenguinShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtime.png");
	}
}
