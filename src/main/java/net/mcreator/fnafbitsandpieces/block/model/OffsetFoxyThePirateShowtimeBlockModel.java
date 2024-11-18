package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetFoxyThePirateShowtimeTileEntity;

public class OffsetFoxyThePirateShowtimeBlockModel extends AnimatedGeoModel<OffsetFoxyThePirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyThePirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeoffset.png");
	}
}
