package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledPenguinShowtimeATileEntity;

public class AngledPenguinShowtimeABlockModel extends AnimatedGeoModel<AngledPenguinShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledPenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledPenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledPenguinShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeangled.png");
	}
}
