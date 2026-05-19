package net.kamaarion.roacw.registeries;

import net.kamaarion.roacw.ROACW;
import net.kamaarion.roacw.entity.spells.final_rend.FinalRendAoE;
import net.kamaarion.roacw.entity.spells.quick_strike.QuickStrikeAoE;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ROACWEntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ROACW.MODID);
    // Quick Strike
    public static final RegistryObject<EntityType<QuickStrikeAoE>> QUICK_STRIKE =
            ENTITIES.register("quick_strike", () -> EntityType.Builder.<QuickStrikeAoE>of(QuickStrikeAoE::new, MobCategory.MISC)
                    .sized(5f, 1f)
                    .clientTrackingRange(64)
                    .build(
                            ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "quick_strike").toString()
                    ));

    // Final Rend
    public static final RegistryObject<EntityType<FinalRendAoE>> FINAL_REND =
            ENTITIES.register("final_rend", () -> EntityType.Builder.<FinalRendAoE>of(FinalRendAoE::new, MobCategory.MISC)
                    .sized(12f, 1f)
                    .clientTrackingRange(64)
                    .build(
                            ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "final_rend").toString()
                    ));
    public static void register(IEventBus eventBus)
    {
        ENTITIES.register(eventBus);
    }
}
