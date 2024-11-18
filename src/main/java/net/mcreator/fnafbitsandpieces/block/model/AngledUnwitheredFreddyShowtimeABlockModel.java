package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredFreddyShowtimeATileEntity;

public class AngledUnwitheredFreddyShowtimeABlockModel extends AnimatedGeoModel<AngledUnwitheredFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyshowtimeangled.png");
	}
}
