package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerChicaShowtimeATileEntity;

public class DinerChicaShowtimeABlockModel extends AnimatedGeoModel<DinerChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtime.png");
	}
}
