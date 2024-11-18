package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01RightArmTileEntity;

public class Endo01RightArmBlockModel extends AnimatedGeoModel<Endo01RightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypirateshowtime.png");
	}
}
