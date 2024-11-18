package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledFredbearShowtimeTileEntity;

public class AngledFredbearShowtimeBlockModel extends AnimatedGeoModel<AngledFredbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFredbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtimeangled.png");
	}
}
