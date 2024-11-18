package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFreddyShowtimeADisplayItem;

public class DinerFreddyShowtimeADisplayModel extends AnimatedGeoModel<DinerFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyshowtime.png");
	}
}
