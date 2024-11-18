package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetRatShowtimeTileEntity;

public class OffsetRatShowtimeBlockModel extends AnimatedGeoModel<OffsetRatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetRatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetRatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetRatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeoffset.png");
	}
}
