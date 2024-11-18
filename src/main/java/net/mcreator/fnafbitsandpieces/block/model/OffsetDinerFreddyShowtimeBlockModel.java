package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerFreddyShowtimeTileEntity;

public class OffsetDinerFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetDinerFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyshowtimeoffset.png");
	}
}
