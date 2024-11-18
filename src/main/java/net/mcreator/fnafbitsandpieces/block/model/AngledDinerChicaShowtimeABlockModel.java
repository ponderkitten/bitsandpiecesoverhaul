package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerChicaShowtimeATileEntity;

public class AngledDinerChicaShowtimeABlockModel extends AnimatedGeoModel<AngledDinerChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeangled.png");
	}
}
