package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredGoldenFreddyShowtimeTileEntity;

public class AngledUnwitheredGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddyshowtimeangled.png");
	}
}
