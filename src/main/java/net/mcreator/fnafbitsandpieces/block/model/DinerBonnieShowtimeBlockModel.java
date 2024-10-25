package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieShowtimeTileEntity;

public class DinerBonnieShowtimeBlockModel extends AnimatedGeoModel<DinerBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnie.png");
	}
}
