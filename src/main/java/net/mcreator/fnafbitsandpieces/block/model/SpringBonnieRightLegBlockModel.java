package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringBonnieRightLegTileEntity;

public class SpringBonnieRightLegBlockModel extends AnimatedGeoModel<SpringBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnierightleg.png");
	}
}
