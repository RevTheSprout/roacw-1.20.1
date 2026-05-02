package net.rev.marsarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rev.marsarmor.MarsArmor;
import net.rev.marsarmor.registeries.MarsItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MarsArmor.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(MarsItems.AURIC_INGOT);
        simpleItem(MarsItems.RAW_AURIC);
        simpleItem(MarsItems.CHARGED_AURIC_INGOT);
        simpleItem(MarsItems.FRIED_CHICKEN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(MarsArmor.MODID, "item/" + item.getId().getPath()));
    }
}
