package net.rev.marsarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rev.marsarmor.MarsArmor;
import net.rev.marsarmor.registeries.MarsArmorBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MarsArmor.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(MarsArmorBlocks.AURIC_BLOCK);
        blockWithItem(MarsArmorBlocks.RAW_AURIC_BLOCK);
        blockWithItem(MarsArmorBlocks.AURIC_ORE);
        blockWithItem(MarsArmorBlocks.DEEPSLATE_AURIC_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
