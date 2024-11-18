package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredFoxyShowtimeTileEntity;

public class AngledUnwitheredFoxyShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtimeangled.png");
	}
}
