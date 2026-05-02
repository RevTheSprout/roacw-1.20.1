package net.rev.marsarmor.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.rev.marsarmor.registeries.MarsArmorBlocks;
import net.rev.marsarmor.registeries.MarsItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(MarsArmorBlocks.AURIC_BLOCK.get());
        this.dropSelf(MarsArmorBlocks.RAW_AURIC_BLOCK.get());

        this.add(MarsArmorBlocks.AURIC_ORE.get(), block -> createCopperLikeOreDrops(MarsArmorBlocks.AURIC_ORE.get(), MarsItems.RAW_AURIC.get()));
        this.add(MarsArmorBlocks.AURIC_ORE.get(), block -> createCopperLikeOreDrops(MarsArmorBlocks.DEEPSLATE_AURIC_ORE.get(), MarsItems.RAW_AURIC.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MarsArmorBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
