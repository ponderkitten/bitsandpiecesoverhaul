package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PenguinShowtimeATileEntity;

public class PenguinShowtimeABlockModel extends AnimatedGeoModel<PenguinShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtime.png");
	}
}
