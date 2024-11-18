package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FoxyThePirateShowtimeADisplayItem;

public class FoxyThePirateShowtimeADisplayModel extends AnimatedGeoModel<FoxyThePirateShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtime.png");
	}
}
