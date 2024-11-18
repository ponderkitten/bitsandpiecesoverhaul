package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetPenguinShowtimeATileEntity;

public class OffsetPenguinShowtimeABlockModel extends AnimatedGeoModel<OffsetPenguinShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetPenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetPenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetPenguinShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeoffset.png");
	}
}
