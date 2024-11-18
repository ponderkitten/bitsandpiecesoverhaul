package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetSpringBonnieShowtimeTileEntity;

public class OffsetSpringBonnieShowtimeBlockModel extends AnimatedGeoModel<OffsetSpringBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnieshowtimeoffset.png");
	}
}
