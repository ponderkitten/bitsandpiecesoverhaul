package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetCandyShowtimeTileEntity;

public class OffsetCandyShowtimeBlockModel extends AnimatedGeoModel<OffsetCandyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCandyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCandyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCandyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeoffset.png");
	}
}
