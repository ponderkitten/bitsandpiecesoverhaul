package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredGoldenFreddyShowtimeTileEntity;

public class UnwitheredGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<UnwitheredGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddyshowtime.png");
	}
}
