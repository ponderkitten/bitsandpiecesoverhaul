package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CatShowtimeADisplayItem;

public class CatShowtimeADisplayModel extends AnimatedGeoModel<CatShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtime.png");
	}
}
