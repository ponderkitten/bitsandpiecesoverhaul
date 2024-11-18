package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledSpringBonnieShowtimeTileEntity;

public class AngledSpringBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledSpringBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledSpringBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnieshowtimeangled.png");
	}
}
