package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFreddyShowtimeTileEntity;

public class DinerFreddyShowtimeBlockModel extends AnimatedGeoModel<DinerFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddy.png");
	}
}
