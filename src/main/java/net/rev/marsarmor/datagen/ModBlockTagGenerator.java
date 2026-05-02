package net.rev.marsarmor.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.rev.marsarmor.MarsArmor;
import net.rev.marsarmor.registeries.MarsArmorBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MarsArmor.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MarsArmorBlocks.AURIC_BLOCK.get(),
                        MarsArmorBlocks.RAW_AURIC_BLOCK.get(),
                        MarsArmorBlocks.AURIC_ORE.get(),
                        MarsArmorBlocks.DEEPSLATE_AURIC_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(MarsArmorBlocks.AURIC_BLOCK.get(),
                        MarsArmorBlocks.RAW_AURIC_BLOCK.get(),
                        MarsArmorBlocks.AURIC_ORE.get(),
                        MarsArmorBlocks.DEEPSLATE_AURIC_ORE.get());
    }
}
