package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerFoxyShowtimeATileEntity;

public class OffsetDinerFoxyShowtimeABlockModel extends AnimatedGeoModel<OffsetDinerFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeoffset.png");
	}
}
