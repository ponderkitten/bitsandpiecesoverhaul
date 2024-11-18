package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetRatShowtimeATileEntity;

public class OffsetRatShowtimeABlockModel extends AnimatedGeoModel<OffsetRatShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetRatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetRatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetRatShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeoffset.png");
	}
}
