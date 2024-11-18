package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerGoldenBonnieShowtimeTileEntity;

public class OffsetDinerGoldenBonnieShowtimeBlockModel extends AnimatedGeoModel<OffsetDinerGoldenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnierightarm.png");
	}
}
