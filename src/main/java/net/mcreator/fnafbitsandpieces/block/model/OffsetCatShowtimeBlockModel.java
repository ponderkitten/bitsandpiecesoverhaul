package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetCatShowtimeTileEntity;

public class OffsetCatShowtimeBlockModel extends AnimatedGeoModel<OffsetCatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeoffset.png");
	}
}
