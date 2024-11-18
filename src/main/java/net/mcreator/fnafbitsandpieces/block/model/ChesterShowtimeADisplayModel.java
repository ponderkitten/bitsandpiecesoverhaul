package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChesterShowtimeADisplayItem;

public class ChesterShowtimeADisplayModel extends AnimatedGeoModel<ChesterShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChesterShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChesterShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChesterShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtime.png");
	}
}
