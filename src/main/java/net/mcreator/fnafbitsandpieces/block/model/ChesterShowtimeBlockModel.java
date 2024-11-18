package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChesterShowtimeTileEntity;

public class ChesterShowtimeBlockModel extends AnimatedGeoModel<ChesterShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChesterShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChesterShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChesterShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtime.png");
	}
}
