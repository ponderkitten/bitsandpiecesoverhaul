package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFoxyThePirateShowtimeADisplayItem;

public class OffsetFoxyThePirateShowtimeADisplayModel extends AnimatedGeoModel<OffsetFoxyThePirateShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyThePirateShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtimeoffset.png");
	}
}
