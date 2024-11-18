package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetCandyShowtimeATileEntity;

public class OffsetCandyShowtimeABlockModel extends AnimatedGeoModel<OffsetCandyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCandyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeoffset.png");
	}
}
