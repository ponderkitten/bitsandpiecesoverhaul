package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledCandyShowtimeATileEntity;

public class AngledCandyShowtimeABlockModel extends AnimatedGeoModel<AngledCandyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledCandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCandyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeangled.png");
	}
}
