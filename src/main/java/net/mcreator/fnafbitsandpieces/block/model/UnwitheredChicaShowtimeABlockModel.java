package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredChicaShowtimeATileEntity;

public class UnwitheredChicaShowtimeABlockModel extends AnimatedGeoModel<UnwitheredChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwithered_chica.png");
	}
}
