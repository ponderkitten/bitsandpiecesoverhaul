package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredChicaShowtimeADisplayItem;

public class UnwitheredChicaShowtimeADisplayModel extends AnimatedGeoModel<UnwitheredChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtime.png");
	}
}
