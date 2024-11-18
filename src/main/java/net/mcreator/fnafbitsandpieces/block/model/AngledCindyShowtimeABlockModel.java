package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledCindyShowtimeATileEntity;

public class AngledCindyShowtimeABlockModel extends AnimatedGeoModel<AngledCindyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledCindyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCindyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCindyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeangled.png");
	}
}
