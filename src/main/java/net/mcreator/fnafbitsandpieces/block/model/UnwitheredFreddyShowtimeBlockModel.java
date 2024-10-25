package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredFreddyShowtimeTileEntity;

public class UnwitheredFreddyShowtimeBlockModel extends AnimatedGeoModel<UnwitheredFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwithered_freddy.png");
	}
}
