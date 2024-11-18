package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01RightArmFoxyTileEntity;

public class Endo01RightArmFoxyBlockModel extends AnimatedGeoModel<Endo01RightArmFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightArmFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightArmFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightArmFoxyTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01rightarmfoxy.png");
	}
}
