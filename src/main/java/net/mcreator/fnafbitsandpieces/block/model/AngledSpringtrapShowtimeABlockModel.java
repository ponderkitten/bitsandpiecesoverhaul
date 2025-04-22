package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledSpringtrapShowtimeATileEntity;

public class AngledSpringtrapShowtimeABlockModel extends AnimatedGeoModel<AngledSpringtrapShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledSpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledSpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledSpringtrapShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeangled.png");
	}
}
