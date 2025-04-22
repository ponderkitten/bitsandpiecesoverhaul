package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PurpleGuyLeftArmTileEntity;

public class PurpleGuyLeftArmBlockModel extends AnimatedGeoModel<PurpleGuyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyleftarm.png");
	}
}
