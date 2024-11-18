package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CindyShowtimeATileEntity;

public class CindyShowtimeABlockModel extends AnimatedGeoModel<CindyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CindyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtime.png");
	}
}
