package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerChicaShowtimeATileEntity;

public class OffsetDinerChicaShowtimeABlockModel extends AnimatedGeoModel<OffsetDinerChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeoffset.png");
	}
}
