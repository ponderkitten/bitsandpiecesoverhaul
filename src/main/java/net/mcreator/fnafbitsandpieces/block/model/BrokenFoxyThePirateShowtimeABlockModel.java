package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenFoxyThePirateShowtimeATileEntity;

public class BrokenFoxyThePirateShowtimeABlockModel extends AnimatedGeoModel<BrokenFoxyThePirateShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtime.png");
	}
}
