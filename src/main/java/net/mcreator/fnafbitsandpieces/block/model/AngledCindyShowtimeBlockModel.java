package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledCindyShowtimeTileEntity;

public class AngledCindyShowtimeBlockModel extends AnimatedGeoModel<AngledCindyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledCindyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCindyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCindyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeangled.png");
	}
}
