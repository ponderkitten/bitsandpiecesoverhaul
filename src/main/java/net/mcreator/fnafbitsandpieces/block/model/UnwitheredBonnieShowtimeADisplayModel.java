package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredBonnieShowtimeADisplayItem;

public class UnwitheredBonnieShowtimeADisplayModel extends AnimatedGeoModel<UnwitheredBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwithered_bonnie.png");
	}
}
