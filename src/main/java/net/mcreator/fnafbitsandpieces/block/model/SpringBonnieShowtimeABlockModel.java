package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringBonnieShowtimeATileEntity;

public class SpringBonnieShowtimeABlockModel extends AnimatedGeoModel<SpringBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnie.png");
	}
}
