package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetGoldenToyFreddyShowtimeATileEntity;

public class OffsetGoldenToyFreddyShowtimeABlockModel extends AnimatedGeoModel<OffsetGoldenToyFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeoffset.png");
	}
}
