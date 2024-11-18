package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledFreddyFazbearShowtimeATileEntity;

public class AngledFreddyFazbearShowtimeABlockModel extends AnimatedGeoModel<AngledFreddyFazbearShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledFreddyFazbearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFreddyFazbearShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFreddyFazbearShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearshowtimeangled.png");
	}
}