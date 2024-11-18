package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerGoldenFreddyShowtimeTileEntity;

public class OffsetDinerGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetDinerGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtimeoffset.png");
	}
}
