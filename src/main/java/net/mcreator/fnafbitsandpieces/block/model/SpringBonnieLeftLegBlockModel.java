package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringBonnieLeftLegTileEntity;

public class SpringBonnieLeftLegBlockModel extends AnimatedGeoModel<SpringBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnieleftleg.png");
	}
}
