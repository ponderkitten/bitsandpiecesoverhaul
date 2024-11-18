package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerFoxyShowtimeTileEntity;

public class OffsetDinerFoxyShowtimeBlockModel extends AnimatedGeoModel<OffsetDinerFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeoffset.png");
	}
}
