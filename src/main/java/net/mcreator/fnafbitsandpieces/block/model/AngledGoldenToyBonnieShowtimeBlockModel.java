package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledGoldenToyBonnieShowtimeTileEntity;

public class AngledGoldenToyBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledGoldenToyBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnieshowtimeangled.png");
	}
}
