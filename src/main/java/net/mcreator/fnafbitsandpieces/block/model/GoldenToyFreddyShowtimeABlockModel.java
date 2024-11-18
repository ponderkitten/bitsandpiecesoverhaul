package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenToyFreddyShowtimeATileEntity;

public class GoldenToyFreddyShowtimeABlockModel extends AnimatedGeoModel<GoldenToyFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtime.png");
	}
}
