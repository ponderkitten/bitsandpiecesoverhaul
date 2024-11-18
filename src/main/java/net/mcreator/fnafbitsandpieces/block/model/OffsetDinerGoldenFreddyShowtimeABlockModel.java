package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerGoldenFreddyShowtimeATileEntity;

public class OffsetDinerGoldenFreddyShowtimeABlockModel extends AnimatedGeoModel<OffsetDinerGoldenFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtimeoffset.png");
	}
}
