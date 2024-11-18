package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetBrokenFoxyThePirateShowtimeATileEntity;

public class OffsetBrokenFoxyThePirateShowtimeABlockModel extends AnimatedGeoModel<OffsetBrokenFoxyThePirateShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBrokenFoxyThePirateShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeoffset.png");
	}
}
