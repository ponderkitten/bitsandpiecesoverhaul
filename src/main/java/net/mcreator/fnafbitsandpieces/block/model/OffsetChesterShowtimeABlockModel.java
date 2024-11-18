package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetChesterShowtimeATileEntity;

public class OffsetChesterShowtimeABlockModel extends AnimatedGeoModel<OffsetChesterShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetChesterShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeoffset.png");
	}
}
