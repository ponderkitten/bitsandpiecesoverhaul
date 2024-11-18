package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerFoxyShowtimeATileEntity;

public class AngledDinerFoxyShowtimeABlockModel extends AnimatedGeoModel<AngledDinerFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeangled.png");
	}
}
