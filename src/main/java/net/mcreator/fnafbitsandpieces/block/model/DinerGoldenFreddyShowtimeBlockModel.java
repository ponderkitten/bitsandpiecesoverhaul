package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerGoldenFreddyShowtimeTileEntity;

public class DinerGoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<DinerGoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerGoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerGoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtime.png");
	}
}
