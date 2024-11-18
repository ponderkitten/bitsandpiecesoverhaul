package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledBrokenFoxyThePirateShowtimeATileEntity;

public class AngledBrokenFoxyThePirateShowtimeABlockModel extends AnimatedGeoModel<AngledBrokenFoxyThePirateShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledBrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBrokenFoxyThePirateShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeangled.png");
	}
}
