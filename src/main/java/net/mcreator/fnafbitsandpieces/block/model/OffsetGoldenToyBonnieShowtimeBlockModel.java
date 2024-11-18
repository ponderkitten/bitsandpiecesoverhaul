package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetGoldenToyBonnieShowtimeTileEntity;

public class OffsetGoldenToyBonnieShowtimeBlockModel extends AnimatedGeoModel<OffsetGoldenToyBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
