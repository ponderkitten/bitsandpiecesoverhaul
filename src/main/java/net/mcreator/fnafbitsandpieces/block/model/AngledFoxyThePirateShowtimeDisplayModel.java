package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledFoxyThePirateShowtimeDisplayItem;

public class AngledFoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<AngledFoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeangled.png");
	}
}
