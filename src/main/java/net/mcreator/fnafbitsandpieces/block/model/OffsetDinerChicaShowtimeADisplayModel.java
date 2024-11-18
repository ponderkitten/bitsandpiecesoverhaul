package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerChicaShowtimeADisplayItem;

public class OffsetDinerChicaShowtimeADisplayModel extends AnimatedGeoModel<OffsetDinerChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeoffset.png");
	}
}
