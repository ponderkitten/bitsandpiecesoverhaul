package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetBonnieBunnyShowtimeATileEntity;

public class OffsetBonnieBunnyShowtimeABlockModel extends AnimatedGeoModel<OffsetBonnieBunnyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBonnieBunnyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBonnieBunnyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBonnieBunnyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyshowtimeoffset.png");
	}
}
