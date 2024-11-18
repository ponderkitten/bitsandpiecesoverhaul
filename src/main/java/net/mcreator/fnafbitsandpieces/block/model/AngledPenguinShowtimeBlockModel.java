package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledPenguinShowtimeTileEntity;

public class AngledPenguinShowtimeBlockModel extends AnimatedGeoModel<AngledPenguinShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledPenguinShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledPenguinShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledPenguinShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeangled.png");
	}
}
