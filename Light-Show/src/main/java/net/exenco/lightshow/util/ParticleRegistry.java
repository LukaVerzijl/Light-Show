package net.exenco.lightshow.util;

import org.bukkit.Particle;

public enum ParticleRegistry {
    EXPLOSION_NORMAL(0, Particle.EXPLOSION),
    FIREWORKS_SPARK(1, Particle.FIREWORK),
    WATER_BUBBLE(2, Particle.UNDERWATER),
    WATER_SPLASH(3, Particle.SPLASH),
    WATER_WAKE(4, Particle.UNDERWATER),
    CRIT(5, Particle.CRIT),
    SMOKE_NORMAL(6, Particle.SMOKE),
    SMOKE_LARGE(7, Particle.LARGE_SMOKE),
    SPELL_WITCH(8, Particle.WITCH),
    DRIP_WATER(9, Particle.DRIPPING_WATER),
    DRIP_LAVA(10, Particle.DRIPPING_LAVA),
    VILLAGER_ANGRY(11, Particle.ANGRY_VILLAGER),
    VILLAGER_HAPPY(12, Particle.HAPPY_VILLAGER),
    NOTE(13, Particle.NOTE),
    PORTAL(14, Particle.PORTAL),
    ENCHANTMENT_TABLE(15, Particle.ENCHANT),
    FLAME(16, Particle.FLAME),
    LAVA(17, Particle.LAVA),
    CLOUD(18, Particle.CLOUD),
    SNOWBALL(19, Particle.ITEM_SNOWBALL),
    SLIME(20, Particle.ITEM_SLIME),
    HEART(21, Particle.HEART),
    WATER_DROP(22, Particle.DRIPPING_WATER),
    DRAGON_BREATH(23, Particle.DRAGON_BREATH),
    END_ROD(24, Particle.END_ROD),
    DAMAGE_INDICATOR(25, Particle.DAMAGE_INDICATOR),
    SWEEP_ATTACK(26, Particle.SWEEP_ATTACK),
    TOTEM(27, Particle.TOTEM_OF_UNDYING),
    SPIT(28, Particle.SPIT),
    SQUID_INK(29, Particle.SQUID_INK),
    BUBBLE_POP(30, Particle.BUBBLE_POP),
    CURRENT_DOWN(31, Particle.CURRENT_DOWN),
    BUBBLE_COLUMN_UP(32, Particle.BUBBLE_COLUMN_UP),
    NAUTILUS(33, Particle.NAUTILUS),
    DOLPHIN(34, Particle.DOLPHIN),
    SNEEZE(35, Particle.SNEEZE),
    CAMPFIRE_COSY_SMOKE(36, Particle.CAMPFIRE_COSY_SMOKE),
    CAMPFIRE_SIGNAL_SMOKE(37, Particle.CAMPFIRE_COSY_SMOKE),
    COMPOSTER(38, Particle.COMPOSTER),
    FLASH(39, Particle.FLASH),
    FALLING_LAVA(40, Particle.FALLING_LAVA),
    LANDING_LAVA(41, Particle.LANDING_LAVA),
    FALLING_WATER(42, Particle.FALLING_WATER),
    DRIPPING_HONEY(43, Particle.DRIPPING_HONEY),
    FALLING_HONEY(44, Particle.FALLING_HONEY),
    LANDING_HONEY(45, Particle.LANDING_HONEY),
    FALLING_NECTAR(46, Particle.FALLING_NECTAR),
    SOUL_FIRE_FLAME(47, Particle.SOUL_FIRE_FLAME),
    ASH(48, Particle.ASH),
    CRIMSON_SPORE(49, Particle.CRIMSON_SPORE),
    WARPED_SPORE(50, Particle.WARPED_SPORE),
    SOUL(51, Particle.SOUL),
    DRIPPING_OBSIDIAN_TEAR(52, Particle.DRIPPING_OBSIDIAN_TEAR),
    FALLING_OBSIDIAN_TEAR(52, Particle.FALLING_OBSIDIAN_TEAR),
    LANDING_OBSIDIAN_TEAR(53, Particle.LANDING_OBSIDIAN_TEAR),
    REVERSE_PORTAL(54, Particle.REVERSE_PORTAL),
    WHITE_ASH(55, Particle.WHITE_ASH),
    FALLING_SPORE_BLOSSOM(56, Particle.FALLING_SPORE_BLOSSOM),
    SPORE_BLOSSOM_AIR(57, Particle.SPORE_BLOSSOM_AIR),
    SMALL_FLAME(58, Particle.SMALL_FLAME),
    SNOWFLAKE(59, Particle.SNOWFLAKE),
    DRIPPING_DRIPSTONE_LAVA(60, Particle.DRIPPING_DRIPSTONE_LAVA),
    FALLING_DRIPSTONE_LAVA(61, Particle.DRIPPING_DRIPSTONE_LAVA),
    DRIPPING_DRIPSTONE_WATER(62, Particle.DRIPPING_DRIPSTONE_WATER),
    FALLING_DRIPSTONE_WATER(63, Particle.FALLING_DRIPSTONE_WATER),
    GLOW_SQUID_INK(64, Particle.GLOW_SQUID_INK),
    GLOW(65, Particle.GLOW),
    WAX_ON(66, Particle.WAX_ON),
    WAX_OFF(67, Particle.WAX_OFF),
    ELECTRIC_SPARK(68, Particle.ELECTRIC_SPARK),
    SCRAPE(69, Particle.SCRAPE);

    private final int id;
    private final Particle bukkitParticle;

    ParticleRegistry(int id, Particle bukkitParticle) {
        this.id = id;
        this.bukkitParticle = bukkitParticle;
    }

    public static Particle getById(int id) {
        for(ParticleRegistry particleRegistry : ParticleRegistry.values())
            if(particleRegistry.getId() == id)
                return particleRegistry.getBukkitParticle();
            return null;
    }

    private int getId() {
        return id;
    }

    public Particle getBukkitParticle() {
        return bukkitParticle;
    }
}
