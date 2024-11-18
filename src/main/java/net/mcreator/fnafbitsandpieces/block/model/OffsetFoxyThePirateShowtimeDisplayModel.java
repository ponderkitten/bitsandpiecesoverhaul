package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFoxyThePirateShowtimeDisplayItem;

public class OffsetFoxyThePirateShowtimeDisplayModel extends AnimatedGeoModel<OffsetFoxyThePirateShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyThePirateShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyThePirateShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeoffset.png");
	}
}
