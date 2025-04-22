package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FoxyThePirateHeadTileEntity;

public class FoxyThePirateHeadBlockModel extends AnimatedGeoModel<FoxyThePirateHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypiratehead.png");
	}
}
