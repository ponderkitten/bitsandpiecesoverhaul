package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerGoldenBonnieShowtimeTileEntity;

public class AngledDinerGoldenBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledDinerGoldenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerGoldenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieangled.png");
	}
}
