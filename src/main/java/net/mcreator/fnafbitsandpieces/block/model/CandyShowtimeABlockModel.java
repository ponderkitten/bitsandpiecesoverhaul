package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CandyShowtimeATileEntity;

public class CandyShowtimeABlockModel extends AnimatedGeoModel<CandyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtime.png");
	}
}
