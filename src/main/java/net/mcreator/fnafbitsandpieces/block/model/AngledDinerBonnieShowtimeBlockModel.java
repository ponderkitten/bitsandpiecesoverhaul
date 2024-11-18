package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerBonnieShowtimeTileEntity;

public class AngledDinerBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledDinerBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieshowtimeangled.png");
	}
}
