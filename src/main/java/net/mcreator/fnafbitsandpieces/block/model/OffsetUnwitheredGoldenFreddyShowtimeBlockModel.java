package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetUnwitheredGoldenFreddyShowtimeTileEntity;

public class OffsetUnwitheredGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetUnwitheredGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddyshowtimeoffset.png");
	}
}
