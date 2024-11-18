package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetDinerFreddyShowtimeATileEntity;

public class OffsetDinerFreddyShowtimeABlockModel extends AnimatedGeoModel<OffsetDinerFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyshowtimeoffset.png");
	}
}
