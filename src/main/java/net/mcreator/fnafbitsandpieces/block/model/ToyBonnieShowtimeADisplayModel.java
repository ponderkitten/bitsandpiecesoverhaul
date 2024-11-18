package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyBonnieShowtimeADisplayItem;

public class ToyBonnieShowtimeADisplayModel extends AnimatedGeoModel<ToyBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnieshowtime.png");
	}
}
