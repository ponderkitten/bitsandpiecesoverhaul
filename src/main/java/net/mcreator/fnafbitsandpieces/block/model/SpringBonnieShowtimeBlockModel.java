package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringBonnieShowtimeTileEntity;

public class SpringBonnieShowtimeBlockModel extends AnimatedGeoModel<SpringBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnie.png");
	}
}
