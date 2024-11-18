package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetFoxyThePirateShowtimeATileEntity;

public class OffsetFoxyThePirateShowtimeABlockModel extends AnimatedGeoModel<OffsetFoxyThePirateShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyThePirateShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeoffset.png");
	}
}
