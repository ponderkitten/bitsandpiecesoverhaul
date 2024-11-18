package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetYellowRabbitShowtimeATileEntity;

public class OffsetYellowRabbitShowtimeABlockModel extends AnimatedGeoModel<OffsetYellowRabbitShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowRabbitShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowRabbitShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowRabbitShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtimeoffset.png");
	}
}
