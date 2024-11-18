package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChesterShowtimeATileEntity;

public class ChesterShowtimeABlockModel extends AnimatedGeoModel<ChesterShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChesterShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtime.png");
	}
}
