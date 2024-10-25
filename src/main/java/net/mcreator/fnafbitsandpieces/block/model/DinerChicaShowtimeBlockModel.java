package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerChicaShowtimeTileEntity;

public class DinerChicaShowtimeBlockModel extends AnimatedGeoModel<DinerChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchica.png");
	}
}
