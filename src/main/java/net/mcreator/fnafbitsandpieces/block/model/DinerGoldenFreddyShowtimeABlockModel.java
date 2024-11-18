package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerGoldenFreddyShowtimeATileEntity;

public class DinerGoldenFreddyShowtimeABlockModel extends AnimatedGeoModel<DinerGoldenFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerGoldenFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerGoldenFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtime.png");
	}
}
