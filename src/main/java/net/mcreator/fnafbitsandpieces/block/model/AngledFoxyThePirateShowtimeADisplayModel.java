package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledFoxyThePirateShowtimeADisplayItem;

public class AngledFoxyThePirateShowtimeADisplayModel extends AnimatedGeoModel<AngledFoxyThePirateShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFoxyThePirateShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeangled.png");
	}
}
