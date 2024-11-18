package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetUnwitheredFoxyShowtimeTileEntity;

public class OffsetUnwitheredFoxyShowtimeBlockModel extends AnimatedGeoModel<OffsetUnwitheredFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtimeoffset.png");
	}
}
