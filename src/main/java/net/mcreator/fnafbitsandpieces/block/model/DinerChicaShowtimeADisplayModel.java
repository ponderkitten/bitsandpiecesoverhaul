package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerChicaShowtimeADisplayItem;

public class DinerChicaShowtimeADisplayModel extends AnimatedGeoModel<DinerChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchica.png");
	}
}
