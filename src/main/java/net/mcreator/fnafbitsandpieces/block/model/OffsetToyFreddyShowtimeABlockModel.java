package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetToyFreddyShowtimeATileEntity;

public class OffsetToyFreddyShowtimeABlockModel extends AnimatedGeoModel<OffsetToyFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyshowtimeoffset.png");
	}
}