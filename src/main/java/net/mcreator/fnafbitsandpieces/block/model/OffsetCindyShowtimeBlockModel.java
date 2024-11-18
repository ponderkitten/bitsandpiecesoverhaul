package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetCindyShowtimeTileEntity;

public class OffsetCindyShowtimeBlockModel extends AnimatedGeoModel<OffsetCindyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCindyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCindyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCindyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeoffset.png");
	}
}
