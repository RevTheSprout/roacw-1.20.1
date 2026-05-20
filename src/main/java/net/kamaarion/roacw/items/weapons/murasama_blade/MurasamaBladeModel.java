package net.kamaarion.roacw.items.weapons.murasama_blade;

import net.kamaarion.roacw.ROACW;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.model.GeoModel;

public class MurasamaBladeModel extends DefaultedItemGeoModel<MurasamaBladeItem> {
    public MurasamaBladeModel() {super (ResourceLocation.fromNamespaceAndPath(ROACW.MODID, ""));}

    public ResourceLocation getModelResource(MurasamaBladeItem object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "geo/item/weapon/murasama_blade.geo.json");
    }

    public ResourceLocation getTextureResource(MurasamaBladeItem object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "textures/item/weapon/murasama_blade.png");
    }

    public ResourceLocation getAnimationResource(MurasamaBladeItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "animations/wizard_armor_animation.json");
    }
}
