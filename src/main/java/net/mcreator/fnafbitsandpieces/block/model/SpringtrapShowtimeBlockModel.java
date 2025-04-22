package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringtrapShowtimeTileEntity;

public class SpringtrapShowtimeBlockModel extends AnimatedGeoModel<SpringtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtime.png");
	}
}
