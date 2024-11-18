package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetSpringBonnieShowtimeATileEntity;

public class OffsetSpringBonnieShowtimeABlockModel extends AnimatedGeoModel<OffsetSpringBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnieshowtimeoffset.png");
	}
}
