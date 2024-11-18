package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetToyBonnieShowtimeATileEntity;

public class OffsetToyBonnieShowtimeABlockModel extends AnimatedGeoModel<OffsetToyBonnieShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyBonnieShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyBonnieShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnieshowtimeoffset.png");
	}
}
