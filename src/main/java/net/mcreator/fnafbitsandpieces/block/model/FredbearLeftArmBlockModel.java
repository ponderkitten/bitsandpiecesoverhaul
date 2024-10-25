package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredbearLeftArmTileEntity;

public class FredbearLeftArmBlockModel extends AnimatedGeoModel<FredbearLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearleftarm.png");
	}
}
