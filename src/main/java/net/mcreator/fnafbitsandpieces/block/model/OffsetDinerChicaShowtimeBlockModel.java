package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerChicaShowtimeTileEntity;

public class OffsetDinerChicaShowtimeBlockModel extends AnimatedGeoModel<OffsetDinerChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeoffset.png");
	}
}
