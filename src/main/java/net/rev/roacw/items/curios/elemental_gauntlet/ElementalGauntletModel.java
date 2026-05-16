package net.rev.roacw.items.curios.elemental_gauntlet;

import net.minecraft.resources.ResourceLocation;
import net.rev.roacw.ROACW;
import net.rev.roacw.items.curios.elemental_gauntlet.ElementalGauntlet;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class ElementalGauntletModel extends DefaultedItemGeoModel<ElementalGauntlet> {
    public ElementalGauntletModel() {
        super(ResourceLocation.fromNamespaceAndPath(ROACW.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(ElementalGauntlet object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "geo/item/curio/elemental_gauntlet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ElementalGauntlet object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "textures/item/curio/elemental_gauntlet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ElementalGauntlet animatable) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "animations/mars_armor.animation.json");
    }
}
