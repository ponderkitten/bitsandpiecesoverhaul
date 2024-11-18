package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerGoldenBonnieShowtimeATileEntity;

public class OffsetDinerGoldenBonnieShowtimeABlockModel extends AnimatedGeoModel<OffsetDinerGoldenBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieoffset.png");
	}
}
