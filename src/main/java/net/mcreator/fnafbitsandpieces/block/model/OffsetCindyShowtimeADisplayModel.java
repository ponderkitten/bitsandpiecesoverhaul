package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetCindyShowtimeADisplayItem;

public class OffsetCindyShowtimeADisplayModel extends AnimatedGeoModel<OffsetCindyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCindyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeoffset.png");
	}
}
