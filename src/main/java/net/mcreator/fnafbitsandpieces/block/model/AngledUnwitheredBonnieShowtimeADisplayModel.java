package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredBonnieShowtimeADisplayItem;

public class AngledUnwitheredBonnieShowtimeADisplayModel extends AnimatedGeoModel<AngledUnwitheredBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieshowtimeangled.png");
	}
}
