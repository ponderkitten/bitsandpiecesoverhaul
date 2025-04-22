package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerGoldenBonnieShowtimeATileEntity;

public class AngledDinerGoldenBonnieShowtimeABlockModel extends AnimatedGeoModel<AngledDinerGoldenBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerGoldenBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerGoldenBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerGoldenBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieangled.png");
	}
}
