package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledGoldenToyBonnieShowtimeATileEntity;

public class AngledGoldenToyBonnieShowtimeABlockModel extends AnimatedGeoModel<AngledGoldenToyBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnieshowtimeangled.png");
	}
}
