package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledFoxyThePirateShowtimeTileEntity;

public class AngledFoxyThePirateShowtimeBlockModel extends AnimatedGeoModel<AngledFoxyThePirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFoxyThePirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFoxyThePirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeangled.png");
	}
}
