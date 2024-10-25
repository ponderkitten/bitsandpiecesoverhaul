package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringBonnieRightLegDisplayItem;

public class SpringBonnieRightLegDisplayModel extends AnimatedGeoModel<SpringBonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnierightleg.png");
	}
}
