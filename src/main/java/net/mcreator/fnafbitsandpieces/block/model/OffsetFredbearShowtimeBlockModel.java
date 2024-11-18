package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetFredbearShowtimeTileEntity;

public class OffsetFredbearShowtimeBlockModel extends AnimatedGeoModel<OffsetFredbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtimeoffset.png");
	}
}
