package net.kamaarion.roacw.registeries;

import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.kamaarion.roacw.ROACW;
import net.kamaarion.roacw.spells.exo.FinalRendSpell;
import net.kamaarion.roacw.spells.exo.QuickStrikeSpell;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ROACWSpellRegistries {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SpellRegistry.SPELL_REGISTRY_KEY, ROACW.MODID);

    public static RegistryObject<AbstractSpell> registerSpell(AbstractSpell spell)
    {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }
    // Quick Strike (Unleash X amount of strikes with the damage incrementing per recast. Ignores i-frames)
    public static final RegistryObject<AbstractSpell> QUICK_STRIKE = registerSpell(new QuickStrikeSpell());

    // Final Rend (Charge up a devastating slash. This slash deals damage based on health and inflicts strong lifesteal. Ignores i-frames & protection. Caster is given a grace period while charging. Inflicts Disabled and Severed)
    public static final RegistryObject<AbstractSpell> FINAL_REND = registerSpell(new FinalRendSpell());

    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }
}
