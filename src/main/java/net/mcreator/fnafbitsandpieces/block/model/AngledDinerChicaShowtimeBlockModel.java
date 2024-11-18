package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerChicaShowtimeTileEntity;

public class AngledDinerChicaShowtimeBlockModel extends AnimatedGeoModel<AngledDinerChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeangled.png");
	}
}