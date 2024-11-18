package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetUnwitheredChicaShowtimeTileEntity;

public class OffsetUnwitheredChicaShowtimeBlockModel extends AnimatedGeoModel<OffsetUnwitheredChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtimeoffset.png");
	}
}
