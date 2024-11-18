package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredFreddyShowtimeTileEntity;

public class AngledUnwitheredFreddyShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyshowtimeangled.png");
	}
}
