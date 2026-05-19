package net.kamaarion.roacw.items.weapons.murasama_blade;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class MurasamaBladeModel extends GeoModel<MurasamaBlade> {

    public MurasamaBladeModel() {
    }

    public ResourceLocation getModelResource(MurasamaBlade object) {
        return ResourceLocation.fromNamespaceAndPath("roacw", "geo/weapon/murasama_blade.geo.json");
    }

    public ResourceLocation getTextureResource(MurasamaBlade object) {
        return ResourceLocation.fromNamespaceAndPath("roacw", "textures/weapons/murasama_blade.png");
    }

    public ResourceLocation getAnimationResource(MurasamaBlade animatable) {
        return ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "animations/wizard_armor_animation.json");
    }

    @Override
    public void setCustomAnimations(MurasamaBlade animatable, long instanceId, AnimationState<MurasamaBlade> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
    }
}
