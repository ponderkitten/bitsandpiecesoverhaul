package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CandyShowtimeADisplayItem;

public class CandyShowtimeADisplayModel extends AnimatedGeoModel<CandyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtime.png");
	}
}
