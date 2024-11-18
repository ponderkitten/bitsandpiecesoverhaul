package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieShowtimeATileEntity;

public class DinerBonnieShowtimeABlockModel extends AnimatedGeoModel<DinerBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieshowtime.png");
	}
}
