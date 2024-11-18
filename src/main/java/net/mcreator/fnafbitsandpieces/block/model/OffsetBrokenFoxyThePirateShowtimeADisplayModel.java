package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetBrokenFoxyThePirateShowtimeADisplayItem;

public class OffsetBrokenFoxyThePirateShowtimeADisplayModel extends AnimatedGeoModel<OffsetBrokenFoxyThePirateShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetBrokenFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/brokenfoxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetBrokenFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/brokenfoxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetBrokenFoxyThePirateShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateshowtimeoffset.png");
	}
}
