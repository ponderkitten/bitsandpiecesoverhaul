package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredChicaShowtimeTileEntity;

public class AngledUnwitheredChicaShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtimeangled.png");
	}
}
