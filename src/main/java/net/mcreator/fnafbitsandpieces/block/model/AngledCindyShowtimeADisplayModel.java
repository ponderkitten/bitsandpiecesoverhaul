package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCindyShowtimeADisplayItem;

public class AngledCindyShowtimeADisplayModel extends AnimatedGeoModel<AngledCindyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCindyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeangled.png");
	}
}
