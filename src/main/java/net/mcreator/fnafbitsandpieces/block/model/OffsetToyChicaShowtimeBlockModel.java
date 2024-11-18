package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetToyChicaShowtimeTileEntity;

public class OffsetToyChicaShowtimeBlockModel extends AnimatedGeoModel<OffsetToyChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
