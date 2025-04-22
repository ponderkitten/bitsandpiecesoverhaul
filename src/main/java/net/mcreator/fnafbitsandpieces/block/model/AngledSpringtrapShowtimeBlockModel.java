package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledSpringtrapShowtimeTileEntity;

public class AngledSpringtrapShowtimeBlockModel extends AnimatedGeoModel<AngledSpringtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledSpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledSpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledSpringtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeangled.png");
	}
}
