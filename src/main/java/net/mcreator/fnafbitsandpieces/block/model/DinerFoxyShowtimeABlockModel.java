package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFoxyShowtimeATileEntity;

public class DinerFoxyShowtimeABlockModel extends AnimatedGeoModel<DinerFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtime.png");
	}
}
