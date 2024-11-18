package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledDinerFreddyShowtimeATileEntity;

public class AngledDinerFreddyShowtimeABlockModel extends AnimatedGeoModel<AngledDinerFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyshowtimeangled.png");
	}
}
