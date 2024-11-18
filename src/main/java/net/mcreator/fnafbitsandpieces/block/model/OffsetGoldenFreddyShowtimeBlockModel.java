package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetGoldenFreddyShowtimeTileEntity;

public class OffsetGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldenfreddyshowtimeoffset.png");
	}
}
