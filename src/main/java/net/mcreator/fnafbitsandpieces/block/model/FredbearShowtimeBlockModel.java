package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredbearShowtimeTileEntity;

public class FredbearShowtimeBlockModel extends AnimatedGeoModel<FredbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtime.png");
	}
}
