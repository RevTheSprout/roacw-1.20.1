package net.kamaarion.roacw.items.weapons.murasama_blade;

import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.item.UniqueItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.kamaarion.roacw.items.weapons.ROACWWeaponTiers;
import net.kamaarion.roacw.registeries.ROACWAttributeRegistry;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;
import java.util.UUID;

public class MurasamaBlade extends MagicSwordItem implements UniqueItem{
    public MurasamaBlade(SpellDataRegistryHolder[] spellDataRegistryHolders) {
        super(ROACWWeaponTiers.MURASAMABLADE,
                ROACWWeaponTiers.MURASAMABLADE.getAttackDamageBonus(),
                ROACWWeaponTiers.MURASAMABLADE.getSpeed(),
                spellDataRegistryHolders,
                Map.of(
                        ROACWAttributeRegistry.EXO_MAGIC_POWER.get(), new AttributeModifier(UUID.fromString("a552273e-6669-4cd2-80b3-a703b7616336"),
                                "Exo Spell Power", 0.15f, AttributeModifier.Operation.MULTIPLY_BASE),

                        AttributeRegistry.SPELL_POWER.get(), new AttributeModifier(UUID.fromString("b552273e-6669-4cd2-80b3-a703b7616336"),
                                "Spell Power", 0.15f, AttributeModifier.Operation.MULTIPLY_BASE),

                        AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier(UUID.fromString("b552273e-6669-4cd2-80b3-a703b7616336"),
                                "Spell Resist", 0.1f, AttributeModifier.Operation.MULTIPLY_BASE),

                        AttributeRegistry.CASTING_MOVESPEED.get(), new AttributeModifier(UUID.fromString("c552273e-6669-4cd2-80b3-a703b7616336"),
                                "Casting Movespeed", 0.15f, AttributeModifier.Operation.MULTIPLY_BASE)
                ),
                ItemPropertiesHelper
                        .equipment(1)
                        .rarity(Rarity.EPIC));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BlockEntityWithoutLevelRenderer getRenderer() {
        return new MurasamaBladeRenderer(new MurasamaBladeModel());
    }
}
