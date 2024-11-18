package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetCatShowtimeATileEntity;

public class OffsetCatShowtimeABlockModel extends AnimatedGeoModel<OffsetCatShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCatShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeoffset.png");
	}
}
