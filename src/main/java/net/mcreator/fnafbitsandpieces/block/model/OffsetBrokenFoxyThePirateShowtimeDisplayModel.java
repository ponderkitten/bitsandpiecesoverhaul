package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetBrokenFoxyThePirateShowtimeDisplayItem;

public class OffsetBrokenFoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<OffsetBrokenFoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBrokenFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBrokenFoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeoffset.png");
	}
}
