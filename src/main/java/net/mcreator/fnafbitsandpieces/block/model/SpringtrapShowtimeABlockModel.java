package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringtrapShowtimeATileEntity;

public class SpringtrapShowtimeABlockModel extends AnimatedGeoModel<SpringtrapShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtime.png");
	}
}
