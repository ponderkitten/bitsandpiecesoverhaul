package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetSpringtrapShowtimeTileEntity;

public class OffsetSpringtrapShowtimeBlockModel extends AnimatedGeoModel<OffsetSpringtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeoffset.png");
	}
}
