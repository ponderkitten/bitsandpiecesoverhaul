package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetSpringtrapShowtimeATileEntity;

public class OffsetSpringtrapShowtimeABlockModel extends AnimatedGeoModel<OffsetSpringtrapShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringtrapShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringtrapShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeoffset.png");
	}
}
