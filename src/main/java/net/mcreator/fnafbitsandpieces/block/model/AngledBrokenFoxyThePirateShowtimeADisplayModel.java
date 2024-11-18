package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledBrokenFoxyThePirateShowtimeADisplayItem;

public class AngledBrokenFoxyThePirateShowtimeADisplayModel extends AnimatedGeoModel<AngledBrokenFoxyThePirateShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledBrokenFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBrokenFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBrokenFoxyThePirateShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeangled.png");
	}
}
