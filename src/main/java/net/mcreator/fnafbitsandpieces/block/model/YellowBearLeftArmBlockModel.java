package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.YellowBearLeftArmTileEntity;

public class YellowBearLeftArmBlockModel extends AnimatedGeoModel<YellowBearLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbearleftarm.png");
	}
}
