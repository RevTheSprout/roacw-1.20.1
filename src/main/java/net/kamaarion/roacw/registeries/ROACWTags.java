package net.kamaarion.roacw.registeries;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.kamaarion.roacw.ROACW;

public class ROACWTags {
    public static final TagKey<Item> CRAFTABLE_WITH_AURIC_HELM = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "craftable_with_auric_helm"));
    public static final TagKey<Item> CRAFTABLE_WITH_AURIC_CHEST = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "craftable_with_auric_chest"));
    public static final TagKey<Item> EXO_FOCUS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "exo_focus"));
}
