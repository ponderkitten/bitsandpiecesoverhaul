package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledToyBonnieShowtimeTileEntity;

public class AngledToyBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledToyBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnieshowtimeangled.png");
	}
}
