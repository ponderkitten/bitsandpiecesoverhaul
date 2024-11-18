package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.YellowBearShowtimeATileEntity;

public class YellowBearShowtimeABlockModel extends AnimatedGeoModel<YellowBearShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbearshowtime.png");
	}
}
