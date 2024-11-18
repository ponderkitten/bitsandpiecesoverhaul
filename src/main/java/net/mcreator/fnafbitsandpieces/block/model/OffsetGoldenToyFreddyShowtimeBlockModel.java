package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetGoldenToyFreddyShowtimeTileEntity;

public class OffsetGoldenToyFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetGoldenToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeoffset.png");
	}
}
