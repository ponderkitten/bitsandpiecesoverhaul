package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenToyBonnieLeftArmTileEntity;

public class GoldenToyBonnieLeftArmBlockModel extends AnimatedGeoModel<GoldenToyBonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyBonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnieleftarm.png");
	}
}
