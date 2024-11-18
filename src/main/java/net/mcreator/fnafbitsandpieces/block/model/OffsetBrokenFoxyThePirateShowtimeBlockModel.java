package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetBrokenFoxyThePirateShowtimeTileEntity;

public class OffsetBrokenFoxyThePirateShowtimeBlockModel extends AnimatedGeoModel<OffsetBrokenFoxyThePirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBrokenFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBrokenFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBrokenFoxyThePirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeoffset.png");
	}
}
