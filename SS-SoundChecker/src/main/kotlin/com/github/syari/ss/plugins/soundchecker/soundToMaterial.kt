package com.github.syari.ss.plugins.soundchecker

import org.bukkit.Material
import org.bukkit.Sound

fun soundToMaterial(sound: Sound) = when (sound) {
    Sound.AMBIENT_BASALT_DELTAS_ADDITIONS, Sound.AMBIENT_BASALT_DELTAS_LOOP, Sound.AMBIENT_BASALT_DELTAS_MOOD, Sound.AMBIENT_CAVE, Sound.AMBIENT_CRIMSON_FOREST_ADDITIONS, Sound.AMBIENT_CRIMSON_FOREST_LOOP, Sound.AMBIENT_CRIMSON_FOREST_MOOD, Sound.AMBIENT_NETHER_WASTES_ADDITIONS, Sound.AMBIENT_NETHER_WASTES_LOOP, Sound.AMBIENT_NETHER_WASTES_MOOD, Sound.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, Sound.AMBIENT_SOUL_SAND_VALLEY_LOOP, Sound.AMBIENT_SOUL_SAND_VALLEY_MOOD, Sound.AMBIENT_UNDERWATER_ENTER, Sound.AMBIENT_UNDERWATER_EXIT, Sound.AMBIENT_UNDERWATER_LOOP, Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS, Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE, Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE, Sound.AMBIENT_WARPED_FOREST_ADDITIONS, Sound.AMBIENT_WARPED_FOREST_LOOP, Sound.AMBIENT_WARPED_FOREST_MOOD -> Material.LEATHER
    Sound.BLOCK_ANCIENT_DEBRIS_BREAK, Sound.BLOCK_ANCIENT_DEBRIS_FALL, Sound.BLOCK_ANCIENT_DEBRIS_HIT, Sound.BLOCK_ANCIENT_DEBRIS_PLACE, Sound.BLOCK_ANCIENT_DEBRIS_STEP -> Material.ANCIENT_DEBRIS
    Sound.BLOCK_ANVIL_BREAK, Sound.BLOCK_ANVIL_DESTROY, Sound.BLOCK_ANVIL_FALL, Sound.BLOCK_ANVIL_HIT, Sound.BLOCK_ANVIL_LAND, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_STEP, Sound.BLOCK_ANVIL_USE -> Material.ANVIL
    Sound.BLOCK_BAMBOO_BREAK, Sound.BLOCK_BAMBOO_FALL, Sound.BLOCK_BAMBOO_HIT, Sound.BLOCK_BAMBOO_PLACE, Sound.BLOCK_BAMBOO_SAPLING_BREAK, Sound.BLOCK_BAMBOO_SAPLING_HIT, Sound.BLOCK_BAMBOO_SAPLING_PLACE, Sound.BLOCK_BAMBOO_STEP -> Material.BAMBOO
    Sound.BLOCK_BARREL_CLOSE, Sound.BLOCK_BARREL_OPEN -> Material.BARREL
    Sound.BLOCK_BASALT_BREAK, Sound.BLOCK_BASALT_FALL, Sound.BLOCK_BASALT_HIT, Sound.BLOCK_BASALT_PLACE, Sound.BLOCK_BASALT_STEP -> Material.BASALT
    Sound.BLOCK_BEACON_ACTIVATE, Sound.BLOCK_BEACON_AMBIENT, Sound.BLOCK_BEACON_DEACTIVATE, Sound.BLOCK_BEACON_POWER_SELECT -> Material.BEACON
    Sound.BLOCK_BEEHIVE_DRIP, Sound.BLOCK_BEEHIVE_ENTER, Sound.BLOCK_BEEHIVE_EXIT, Sound.BLOCK_BEEHIVE_SHEAR, Sound.BLOCK_BEEHIVE_WORK -> Material.BEEHIVE
    Sound.BLOCK_BELL_RESONATE, Sound.BLOCK_BELL_USE -> Material.BELL
    Sound.BLOCK_BLASTFURNACE_FIRE_CRACKLE -> Material.BLAST_FURNACE
    Sound.BLOCK_BONE_BLOCK_BREAK, Sound.BLOCK_BONE_BLOCK_FALL, Sound.BLOCK_BONE_BLOCK_HIT, Sound.BLOCK_BONE_BLOCK_PLACE, Sound.BLOCK_BONE_BLOCK_STEP -> Material.BONE_BLOCK
    Sound.BLOCK_BREWING_STAND_BREW -> Material.BREWING_STAND
    Sound.BLOCK_BUBBLE_COLUMN_BUBBLE_POP, Sound.BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT, Sound.BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE, Sound.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT, Sound.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE -> Material.WATER_BUCKET
    Sound.BLOCK_CAMPFIRE_CRACKLE -> Material.CAMPFIRE
    Sound.BLOCK_CHAIN_BREAK, Sound.BLOCK_CHAIN_FALL, Sound.BLOCK_CHAIN_HIT, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_STEP -> Material.CHAIN
    Sound.BLOCK_CHEST_CLOSE, Sound.BLOCK_CHEST_LOCKED, Sound.BLOCK_CHEST_OPEN -> Material.CHEST
    Sound.BLOCK_CHORUS_FLOWER_DEATH, Sound.BLOCK_CHORUS_FLOWER_GROW -> Material.CHORUS_FLOWER
    Sound.BLOCK_COMPARATOR_CLICK, Sound.BLOCK_COMPOSTER_EMPTY, Sound.BLOCK_COMPOSTER_FILL, Sound.BLOCK_COMPOSTER_FILL_SUCCESS, Sound.BLOCK_COMPOSTER_READY -> Material.COMPOSTER
    Sound.BLOCK_CONDUIT_ACTIVATE, Sound.BLOCK_CONDUIT_AMBIENT, Sound.BLOCK_CONDUIT_AMBIENT_SHORT, Sound.BLOCK_CONDUIT_ATTACK_TARGET, Sound.BLOCK_CONDUIT_DEACTIVATE -> Material.CONDUIT
    Sound.BLOCK_CORAL_BLOCK_BREAK, Sound.BLOCK_CORAL_BLOCK_FALL, Sound.BLOCK_CORAL_BLOCK_HIT, Sound.BLOCK_CORAL_BLOCK_PLACE, Sound.BLOCK_CORAL_BLOCK_STEP -> Material.BUBBLE_CORAL_BLOCK
    Sound.BLOCK_CROP_BREAK -> Material.WHEAT
    Sound.BLOCK_DISPENSER_DISPENSE, Sound.BLOCK_DISPENSER_FAIL, Sound.BLOCK_DISPENSER_LAUNCH -> Material.DISPENSER
    Sound.BLOCK_ENCHANTMENT_TABLE_USE -> Material.ENCHANTING_TABLE
    Sound.BLOCK_ENDER_CHEST_CLOSE, Sound.BLOCK_ENDER_CHEST_OPEN -> Material.ENDER_CHEST
    Sound.BLOCK_END_GATEWAY_SPAWN -> Material.ENDER_EYE
    Sound.BLOCK_END_PORTAL_FRAME_FILL, Sound.BLOCK_END_PORTAL_SPAWN -> Material.END_PORTAL_FRAME
    Sound.BLOCK_FENCE_GATE_CLOSE, Sound.BLOCK_FENCE_GATE_OPEN -> Material.OAK_FENCE_GATE
    Sound.BLOCK_FIRE_AMBIENT, Sound.BLOCK_FIRE_EXTINGUISH -> Material.FLINT_AND_STEEL
    Sound.BLOCK_FUNGUS_BREAK, Sound.BLOCK_FUNGUS_FALL, Sound.BLOCK_FUNGUS_HIT, Sound.BLOCK_FUNGUS_PLACE, Sound.BLOCK_FUNGUS_STEP -> Material.CRIMSON_FUNGUS
    Sound.BLOCK_FURNACE_FIRE_CRACKLE -> Material.FURNACE
    Sound.BLOCK_GILDED_BLACKSTONE_BREAK, Sound.BLOCK_GILDED_BLACKSTONE_FALL, Sound.BLOCK_GILDED_BLACKSTONE_HIT, Sound.BLOCK_GILDED_BLACKSTONE_PLACE, Sound.BLOCK_GILDED_BLACKSTONE_STEP -> Material.GILDED_BLACKSTONE
    Sound.BLOCK_GLASS_BREAK, Sound.BLOCK_GLASS_FALL, Sound.BLOCK_GLASS_HIT, Sound.BLOCK_GLASS_PLACE, Sound.BLOCK_GLASS_STEP -> Material.GLASS
    Sound.BLOCK_GRASS_BREAK, Sound.BLOCK_GRASS_FALL, Sound.BLOCK_GRASS_HIT, Sound.BLOCK_GRASS_PLACE, Sound.BLOCK_GRASS_STEP -> Material.GRASS
    Sound.BLOCK_GRAVEL_BREAK, Sound.BLOCK_GRAVEL_FALL, Sound.BLOCK_GRAVEL_HIT, Sound.BLOCK_GRAVEL_PLACE, Sound.BLOCK_GRAVEL_STEP -> Material.GRAVEL
    Sound.BLOCK_GRINDSTONE_USE -> Material.GRINDSTONE
    Sound.BLOCK_HONEY_BLOCK_BREAK, Sound.BLOCK_HONEY_BLOCK_FALL, Sound.BLOCK_HONEY_BLOCK_HIT, Sound.BLOCK_HONEY_BLOCK_PLACE, Sound.BLOCK_HONEY_BLOCK_SLIDE, Sound.BLOCK_HONEY_BLOCK_STEP -> Material.HONEY_BLOCK
    Sound.BLOCK_IRON_DOOR_CLOSE, Sound.BLOCK_IRON_DOOR_OPEN -> Material.IRON_DOOR
    Sound.BLOCK_IRON_TRAPDOOR_CLOSE, Sound.BLOCK_IRON_TRAPDOOR_OPEN -> Material.OAK_TRAPDOOR
    Sound.BLOCK_LADDER_BREAK, Sound.BLOCK_LADDER_FALL, Sound.BLOCK_LADDER_HIT, Sound.BLOCK_LADDER_PLACE, Sound.BLOCK_LADDER_STEP -> Material.LADDER
    Sound.BLOCK_LANTERN_BREAK, Sound.BLOCK_LANTERN_FALL, Sound.BLOCK_LANTERN_HIT, Sound.BLOCK_LANTERN_PLACE, Sound.BLOCK_LANTERN_STEP -> Material.LANTERN
    Sound.BLOCK_LAVA_AMBIENT, Sound.BLOCK_LAVA_EXTINGUISH, Sound.BLOCK_LAVA_POP -> Material.LAVA_BUCKET
    Sound.BLOCK_LEVER_CLICK -> Material.LEVER
    Sound.BLOCK_LILY_PAD_PLACE -> Material.LILY_PAD
    Sound.BLOCK_LODESTONE_BREAK, Sound.BLOCK_LODESTONE_FALL, Sound.BLOCK_LODESTONE_HIT, Sound.BLOCK_LODESTONE_PLACE, Sound.BLOCK_LODESTONE_STEP -> Material.LODESTONE
    Sound.BLOCK_METAL_BREAK, Sound.BLOCK_METAL_FALL, Sound.BLOCK_METAL_HIT, Sound.BLOCK_METAL_PLACE, Sound.BLOCK_METAL_STEP -> Material.IRON_BLOCK
    Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF, Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON -> Material.HEAVY_WEIGHTED_PRESSURE_PLATE
    Sound.BLOCK_NETHERITE_BLOCK_BREAK, Sound.BLOCK_NETHERITE_BLOCK_FALL, Sound.BLOCK_NETHERITE_BLOCK_HIT, Sound.BLOCK_NETHERITE_BLOCK_PLACE, Sound.BLOCK_NETHERITE_BLOCK_STEP -> Material.NETHERITE_BLOCK
    Sound.BLOCK_NETHERRACK_BREAK, Sound.BLOCK_NETHERRACK_FALL, Sound.BLOCK_NETHERRACK_HIT, Sound.BLOCK_NETHERRACK_PLACE, Sound.BLOCK_NETHERRACK_STEP -> Material.NETHERRACK
    Sound.BLOCK_NETHER_BRICKS_BREAK, Sound.BLOCK_NETHER_BRICKS_FALL, Sound.BLOCK_NETHER_BRICKS_HIT, Sound.BLOCK_NETHER_BRICKS_PLACE, Sound.BLOCK_NETHER_BRICKS_STEP -> Material.NETHER_BRICKS
    Sound.BLOCK_NETHER_GOLD_ORE_BREAK, Sound.BLOCK_NETHER_GOLD_ORE_FALL, Sound.BLOCK_NETHER_GOLD_ORE_HIT, Sound.BLOCK_NETHER_GOLD_ORE_PLACE, Sound.BLOCK_NETHER_GOLD_ORE_STEP -> Material.NETHER_GOLD_ORE
    Sound.BLOCK_NETHER_ORE_BREAK, Sound.BLOCK_NETHER_ORE_FALL, Sound.BLOCK_NETHER_ORE_HIT, Sound.BLOCK_NETHER_ORE_PLACE, Sound.BLOCK_NETHER_ORE_STEP -> Material.NETHER_QUARTZ_ORE
    Sound.BLOCK_NETHER_SPROUTS_BREAK, Sound.BLOCK_NETHER_SPROUTS_FALL, Sound.BLOCK_NETHER_SPROUTS_HIT, Sound.BLOCK_NETHER_SPROUTS_PLACE, Sound.BLOCK_NETHER_SPROUTS_STEP -> Material.NETHER_SPROUTS
    Sound.BLOCK_NETHER_WART_BREAK -> Material.NETHER_WART
    Sound.BLOCK_NOTE_BLOCK_BANJO, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, Sound.BLOCK_NOTE_BLOCK_BASS, Sound.BLOCK_NOTE_BLOCK_BELL, Sound.BLOCK_NOTE_BLOCK_BIT, Sound.BLOCK_NOTE_BLOCK_CHIME, Sound.BLOCK_NOTE_BLOCK_COW_BELL, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.BLOCK_NOTE_BLOCK_GUITAR, Sound.BLOCK_NOTE_BLOCK_HARP, Sound.BLOCK_NOTE_BLOCK_HAT, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, Sound.BLOCK_NOTE_BLOCK_PLING, Sound.BLOCK_NOTE_BLOCK_SNARE, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE -> Material.NOTE_BLOCK
    Sound.BLOCK_NYLIUM_BREAK, Sound.BLOCK_NYLIUM_FALL, Sound.BLOCK_NYLIUM_HIT, Sound.BLOCK_NYLIUM_PLACE, Sound.BLOCK_NYLIUM_STEP -> Material.CRIMSON_NYLIUM
    Sound.BLOCK_PISTON_CONTRACT, Sound.BLOCK_PISTON_EXTEND -> Material.PISTON
    Sound.BLOCK_PORTAL_AMBIENT, Sound.BLOCK_PORTAL_TRAVEL, Sound.BLOCK_PORTAL_TRIGGER -> Material.END_PORTAL_FRAME
    Sound.BLOCK_PUMPKIN_CARVE -> Material.PUMPKIN
    Sound.BLOCK_REDSTONE_TORCH_BURNOUT -> Material.REDSTONE_TORCH
    Sound.BLOCK_RESPAWN_ANCHOR_AMBIENT, Sound.BLOCK_RESPAWN_ANCHOR_CHARGE, Sound.BLOCK_RESPAWN_ANCHOR_DEPLETE, Sound.BLOCK_RESPAWN_ANCHOR_SET_SPAWN -> Material.RESPAWN_ANCHOR
    Sound.BLOCK_ROOTS_BREAK, Sound.BLOCK_ROOTS_FALL, Sound.BLOCK_ROOTS_HIT, Sound.BLOCK_ROOTS_PLACE, Sound.BLOCK_ROOTS_STEP -> Material.CRIMSON_ROOTS
    Sound.BLOCK_SAND_BREAK, Sound.BLOCK_SAND_FALL, Sound.BLOCK_SAND_HIT, Sound.BLOCK_SAND_PLACE, Sound.BLOCK_SAND_STEP -> Material.SAND
    Sound.BLOCK_SCAFFOLDING_BREAK, Sound.BLOCK_SCAFFOLDING_FALL, Sound.BLOCK_SCAFFOLDING_HIT, Sound.BLOCK_SCAFFOLDING_PLACE, Sound.BLOCK_SCAFFOLDING_STEP -> Material.SCAFFOLDING
    Sound.BLOCK_SHROOMLIGHT_BREAK, Sound.BLOCK_SHROOMLIGHT_FALL, Sound.BLOCK_SHROOMLIGHT_HIT, Sound.BLOCK_SHROOMLIGHT_PLACE, Sound.BLOCK_SHROOMLIGHT_STEP -> Material.SHROOMLIGHT
    Sound.BLOCK_SHULKER_BOX_CLOSE, Sound.BLOCK_SHULKER_BOX_OPEN -> Material.SHULKER_BOX
    Sound.BLOCK_SLIME_BLOCK_BREAK, Sound.BLOCK_SLIME_BLOCK_FALL, Sound.BLOCK_SLIME_BLOCK_HIT, Sound.BLOCK_SLIME_BLOCK_PLACE, Sound.BLOCK_SLIME_BLOCK_STEP -> Material.SLIME_BLOCK
    Sound.BLOCK_SMITHING_TABLE_USE -> Material.SMITHING_TABLE
    Sound.BLOCK_SMOKER_SMOKE -> Material.SMOKER
    Sound.BLOCK_SNOW_BREAK, Sound.BLOCK_SNOW_FALL, Sound.BLOCK_SNOW_HIT, Sound.BLOCK_SNOW_PLACE, Sound.BLOCK_SNOW_STEP -> Material.SNOW
    Sound.BLOCK_SOUL_SAND_BREAK, Sound.BLOCK_SOUL_SAND_FALL, Sound.BLOCK_SOUL_SAND_HIT, Sound.BLOCK_SOUL_SAND_PLACE, Sound.BLOCK_SOUL_SAND_STEP -> Material.SOUL_SAND
    Sound.BLOCK_SOUL_SOIL_BREAK, Sound.BLOCK_SOUL_SOIL_FALL, Sound.BLOCK_SOUL_SOIL_HIT, Sound.BLOCK_SOUL_SOIL_PLACE, Sound.BLOCK_SOUL_SOIL_STEP -> Material.SOUL_SOIL
    Sound.BLOCK_STEM_BREAK, Sound.BLOCK_STEM_FALL, Sound.BLOCK_STEM_HIT, Sound.BLOCK_STEM_PLACE, Sound.BLOCK_STEM_STEP -> Material.CRIMSON_STEM
    Sound.BLOCK_STONE_BREAK, Sound.BLOCK_STONE_BUTTON_CLICK_OFF, Sound.BLOCK_STONE_BUTTON_CLICK_ON, Sound.BLOCK_STONE_FALL, Sound.BLOCK_STONE_HIT, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_STEP -> Material.STONE
    Sound.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, Sound.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON -> Material.STONE_PRESSURE_PLATE
    Sound.BLOCK_SWEET_BERRY_BUSH_BREAK, Sound.BLOCK_SWEET_BERRY_BUSH_PLACE -> Material.SWEET_BERRIES
    Sound.BLOCK_TRIPWIRE_ATTACH, Sound.BLOCK_TRIPWIRE_CLICK_OFF, Sound.BLOCK_TRIPWIRE_CLICK_ON, Sound.BLOCK_TRIPWIRE_DETACH -> Material.TRIPWIRE_HOOK
    Sound.BLOCK_VINE_STEP -> Material.VINE
    Sound.BLOCK_WART_BLOCK_BREAK, Sound.BLOCK_WART_BLOCK_FALL, Sound.BLOCK_WART_BLOCK_HIT, Sound.BLOCK_WART_BLOCK_PLACE, Sound.BLOCK_WART_BLOCK_STEP -> Material.NETHER_WART_BLOCK
    Sound.BLOCK_WATER_AMBIENT -> Material.WATER_BUCKET
    Sound.BLOCK_WEEPING_VINES_BREAK, Sound.BLOCK_WEEPING_VINES_FALL, Sound.BLOCK_WEEPING_VINES_HIT, Sound.BLOCK_WEEPING_VINES_PLACE, Sound.BLOCK_WEEPING_VINES_STEP -> Material.WEEPING_VINES
    Sound.BLOCK_WET_GRASS_BREAK, Sound.BLOCK_WET_GRASS_FALL, Sound.BLOCK_WET_GRASS_HIT, Sound.BLOCK_WET_GRASS_PLACE, Sound.BLOCK_WET_GRASS_STEP -> Material.GRASS_BLOCK
    Sound.BLOCK_WOODEN_BUTTON_CLICK_OFF, Sound.BLOCK_WOODEN_BUTTON_CLICK_ON -> Material.OAK_BUTTON
    Sound.BLOCK_WOODEN_DOOR_CLOSE, Sound.BLOCK_WOODEN_DOOR_OPEN -> Material.OAK_DOOR
    Sound.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, Sound.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON -> Material.OAK_PRESSURE_PLATE
    Sound.BLOCK_WOODEN_TRAPDOOR_CLOSE, Sound.BLOCK_WOODEN_TRAPDOOR_OPEN -> Material.OAK_TRAPDOOR
    Sound.BLOCK_WOOD_BREAK, Sound.BLOCK_WOOD_FALL, Sound.BLOCK_WOOD_HIT, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_STEP -> Material.OAK_WOOD
    Sound.BLOCK_WOOL_BREAK, Sound.BLOCK_WOOL_FALL, Sound.BLOCK_WOOL_HIT, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_STEP -> Material.WHITE_WOOL
    Sound.ENCHANT_THORNS_HIT -> Material.DIAMOND_CHESTPLATE
    Sound.ENTITY_ARMOR_STAND_BREAK, Sound.ENTITY_ARMOR_STAND_FALL, Sound.ENTITY_ARMOR_STAND_HIT, Sound.ENTITY_ARMOR_STAND_PLACE -> Material.ARMOR_STAND
    Sound.ENTITY_ARROW_HIT, Sound.ENTITY_ARROW_HIT_PLAYER, Sound.ENTITY_ARROW_SHOOT -> Material.ARROW
    Sound.ENTITY_BAT_AMBIENT, Sound.ENTITY_BAT_DEATH, Sound.ENTITY_BAT_HURT, Sound.ENTITY_BAT_LOOP, Sound.ENTITY_BAT_TAKEOFF -> Material.BAT_SPAWN_EGG
    Sound.ENTITY_BEE_DEATH, Sound.ENTITY_BEE_HURT, Sound.ENTITY_BEE_LOOP, Sound.ENTITY_BEE_LOOP_AGGRESSIVE, Sound.ENTITY_BEE_POLLINATE, Sound.ENTITY_BEE_STING -> Material.BEE_SPAWN_EGG
    Sound.ENTITY_BLAZE_AMBIENT, Sound.ENTITY_BLAZE_BURN, Sound.ENTITY_BLAZE_DEATH, Sound.ENTITY_BLAZE_HURT, Sound.ENTITY_BLAZE_SHOOT -> Material.BLAZE_SPAWN_EGG
    Sound.ENTITY_BOAT_PADDLE_LAND, Sound.ENTITY_BOAT_PADDLE_WATER -> Material.OAK_BOAT
    Sound.ENTITY_CAT_AMBIENT, Sound.ENTITY_CAT_BEG_FOR_FOOD, Sound.ENTITY_CAT_DEATH, Sound.ENTITY_CAT_EAT, Sound.ENTITY_CAT_HISS, Sound.ENTITY_CAT_HURT, Sound.ENTITY_CAT_PURR, Sound.ENTITY_CAT_PURREOW, Sound.ENTITY_CAT_STRAY_AMBIENT -> Material.CAT_SPAWN_EGG
    Sound.ENTITY_CHICKEN_AMBIENT, Sound.ENTITY_CHICKEN_DEATH, Sound.ENTITY_CHICKEN_EGG, Sound.ENTITY_CHICKEN_HURT, Sound.ENTITY_CHICKEN_STEP -> Material.CHICKEN_SPAWN_EGG
    Sound.ENTITY_COD_AMBIENT, Sound.ENTITY_COD_DEATH, Sound.ENTITY_COD_FLOP, Sound.ENTITY_COD_HURT -> Material.COD_SPAWN_EGG
    Sound.ENTITY_COW_AMBIENT, Sound.ENTITY_COW_DEATH, Sound.ENTITY_COW_HURT, Sound.ENTITY_COW_MILK, Sound.ENTITY_COW_STEP -> Material.COW_SPAWN_EGG
    Sound.ENTITY_CREEPER_DEATH, Sound.ENTITY_CREEPER_HURT, Sound.ENTITY_CREEPER_PRIMED -> Material.CREEPER_SPAWN_EGG
    Sound.ENTITY_DOLPHIN_AMBIENT, Sound.ENTITY_DOLPHIN_AMBIENT_WATER, Sound.ENTITY_DOLPHIN_ATTACK, Sound.ENTITY_DOLPHIN_DEATH, Sound.ENTITY_DOLPHIN_EAT, Sound.ENTITY_DOLPHIN_HURT, Sound.ENTITY_DOLPHIN_JUMP, Sound.ENTITY_DOLPHIN_PLAY, Sound.ENTITY_DOLPHIN_SPLASH, Sound.ENTITY_DOLPHIN_SWIM -> Material.DOLPHIN_SPAWN_EGG
    Sound.ENTITY_DONKEY_AMBIENT, Sound.ENTITY_DONKEY_ANGRY, Sound.ENTITY_DONKEY_CHEST, Sound.ENTITY_DONKEY_DEATH, Sound.ENTITY_DONKEY_EAT, Sound.ENTITY_DONKEY_HURT -> Material.DONKEY_SPAWN_EGG
    Sound.ENTITY_DRAGON_FIREBALL_EXPLODE -> Material.DRAGON_EGG
    Sound.ENTITY_DROWNED_AMBIENT, Sound.ENTITY_DROWNED_AMBIENT_WATER, Sound.ENTITY_DROWNED_DEATH, Sound.ENTITY_DROWNED_DEATH_WATER, Sound.ENTITY_DROWNED_HURT, Sound.ENTITY_DROWNED_HURT_WATER, Sound.ENTITY_DROWNED_SHOOT, Sound.ENTITY_DROWNED_STEP, Sound.ENTITY_DROWNED_SWIM -> Material.DROWNED_SPAWN_EGG
    Sound.ENTITY_EGG_THROW -> Material.EGG
    Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, Sound.ENTITY_ELDER_GUARDIAN_AMBIENT_LAND, Sound.ENTITY_ELDER_GUARDIAN_CURSE, Sound.ENTITY_ELDER_GUARDIAN_DEATH, Sound.ENTITY_ELDER_GUARDIAN_DEATH_LAND, Sound.ENTITY_ELDER_GUARDIAN_FLOP, Sound.ENTITY_ELDER_GUARDIAN_HURT, Sound.ENTITY_ELDER_GUARDIAN_HURT_LAND -> Material.ELDER_GUARDIAN_SPAWN_EGG
    Sound.ENTITY_ENDERMAN_AMBIENT, Sound.ENTITY_ENDERMAN_DEATH, Sound.ENTITY_ENDERMAN_HURT, Sound.ENTITY_ENDERMAN_SCREAM, Sound.ENTITY_ENDERMAN_STARE, Sound.ENTITY_ENDERMAN_TELEPORT -> Material.ENDERMAN_SPAWN_EGG
    Sound.ENTITY_ENDERMITE_AMBIENT, Sound.ENTITY_ENDERMITE_DEATH, Sound.ENTITY_ENDERMITE_HURT, Sound.ENTITY_ENDERMITE_STEP -> Material.ENDERMITE_SPAWN_EGG
    Sound.ENTITY_ENDER_DRAGON_AMBIENT, Sound.ENTITY_ENDER_DRAGON_DEATH, Sound.ENTITY_ENDER_DRAGON_FLAP, Sound.ENTITY_ENDER_DRAGON_GROWL, Sound.ENTITY_ENDER_DRAGON_HURT, Sound.ENTITY_ENDER_DRAGON_SHOOT -> Material.DRAGON_EGG
    Sound.ENTITY_ENDER_EYE_DEATH, Sound.ENTITY_ENDER_EYE_LAUNCH -> Material.ENDER_EYE
    Sound.ENTITY_ENDER_PEARL_THROW -> Material.ENDER_PEARL
    Sound.ENTITY_EVOKER_AMBIENT, Sound.ENTITY_EVOKER_CAST_SPELL, Sound.ENTITY_EVOKER_CELEBRATE, Sound.ENTITY_EVOKER_DEATH, Sound.ENTITY_EVOKER_FANGS_ATTACK, Sound.ENTITY_EVOKER_HURT, Sound.ENTITY_EVOKER_PREPARE_ATTACK, Sound.ENTITY_EVOKER_PREPARE_SUMMON, Sound.ENTITY_EVOKER_PREPARE_WOLOLO -> Material.EVOKER_SPAWN_EGG
    Sound.ENTITY_EXPERIENCE_BOTTLE_THROW, Sound.ENTITY_EXPERIENCE_ORB_PICKUP -> Material.EXPERIENCE_BOTTLE
    Sound.ENTITY_FIREWORK_ROCKET_BLAST, Sound.ENTITY_FIREWORK_ROCKET_BLAST_FAR, Sound.ENTITY_FIREWORK_ROCKET_LARGE_BLAST, Sound.ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR, Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, Sound.ENTITY_FIREWORK_ROCKET_SHOOT, Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, Sound.ENTITY_FIREWORK_ROCKET_TWINKLE_FAR -> Material.FIREWORK_ROCKET
    Sound.ENTITY_FISHING_BOBBER_RETRIEVE, Sound.ENTITY_FISHING_BOBBER_SPLASH, Sound.ENTITY_FISHING_BOBBER_THROW -> Material.FISHING_ROD
    Sound.ENTITY_FISH_SWIM -> Material.COD
    Sound.ENTITY_FOX_AGGRO, Sound.ENTITY_FOX_AMBIENT, Sound.ENTITY_FOX_BITE, Sound.ENTITY_FOX_DEATH, Sound.ENTITY_FOX_EAT, Sound.ENTITY_FOX_HURT, Sound.ENTITY_FOX_SCREECH, Sound.ENTITY_FOX_SLEEP, Sound.ENTITY_FOX_SNIFF, Sound.ENTITY_FOX_SPIT, Sound.ENTITY_FOX_TELEPORT -> Material.FOX_SPAWN_EGG
    Sound.ENTITY_GENERIC_BIG_FALL, Sound.ENTITY_GENERIC_SMALL_FALL -> Material.LEATHER_BOOTS
    Sound.ENTITY_GENERIC_BURN, Sound.ENTITY_GENERIC_EXTINGUISH_FIRE -> Material.FLINT_AND_STEEL
    Sound.ENTITY_GENERIC_DEATH -> Material.TOTEM_OF_UNDYING
    Sound.ENTITY_GENERIC_DRINK -> Material.POTION
    Sound.ENTITY_GENERIC_EAT -> Material.APPLE
    Sound.ENTITY_GENERIC_EXPLODE -> Material.TNT
    Sound.ENTITY_GENERIC_HURT -> Material.STONE_SWORD
    Sound.ENTITY_GENERIC_SPLASH, Sound.ENTITY_GENERIC_SWIM -> Material.WATER_BUCKET
    Sound.ENTITY_GHAST_AMBIENT, Sound.ENTITY_GHAST_DEATH, Sound.ENTITY_GHAST_HURT, Sound.ENTITY_GHAST_SCREAM, Sound.ENTITY_GHAST_SHOOT, Sound.ENTITY_GHAST_WARN -> Material.GHAST_SPAWN_EGG
    Sound.ENTITY_GUARDIAN_AMBIENT, Sound.ENTITY_GUARDIAN_AMBIENT_LAND, Sound.ENTITY_GUARDIAN_ATTACK, Sound.ENTITY_GUARDIAN_DEATH, Sound.ENTITY_GUARDIAN_DEATH_LAND, Sound.ENTITY_GUARDIAN_FLOP, Sound.ENTITY_GUARDIAN_HURT, Sound.ENTITY_GUARDIAN_HURT_LAND -> Material.GUARDIAN_SPAWN_EGG
    Sound.ENTITY_HOGLIN_AMBIENT, Sound.ENTITY_HOGLIN_ANGRY, Sound.ENTITY_HOGLIN_ATTACK, Sound.ENTITY_HOGLIN_CONVERTED_TO_ZOMBIFIED, Sound.ENTITY_HOGLIN_DEATH, Sound.ENTITY_HOGLIN_HURT, Sound.ENTITY_HOGLIN_RETREAT, Sound.ENTITY_HOGLIN_STEP -> Material.HOGLIN_SPAWN_EGG
    Sound.ENTITY_HORSE_AMBIENT, Sound.ENTITY_HORSE_ANGRY, Sound.ENTITY_HORSE_ARMOR, Sound.ENTITY_HORSE_BREATHE, Sound.ENTITY_HORSE_DEATH, Sound.ENTITY_HORSE_EAT, Sound.ENTITY_HORSE_GALLOP, Sound.ENTITY_HORSE_HURT, Sound.ENTITY_HORSE_JUMP, Sound.ENTITY_HORSE_LAND, Sound.ENTITY_HORSE_SADDLE, Sound.ENTITY_HORSE_STEP, Sound.ENTITY_HORSE_STEP_WOOD -> Material.HORSE_SPAWN_EGG
    Sound.ENTITY_HOSTILE_BIG_FALL, Sound.ENTITY_HOSTILE_SMALL_FALL -> Material.LEATHER_BOOTS
    Sound.ENTITY_HOSTILE_DEATH -> Material.TOTEM_OF_UNDYING
    Sound.ENTITY_HOSTILE_HURT -> Material.STONE_SWORD
    Sound.ENTITY_HOSTILE_SPLASH, Sound.ENTITY_HOSTILE_SWIM -> Material.WATER_BUCKET
    Sound.ENTITY_HUSK_AMBIENT, Sound.ENTITY_HUSK_CONVERTED_TO_ZOMBIE, Sound.ENTITY_HUSK_DEATH, Sound.ENTITY_HUSK_HURT, Sound.ENTITY_HUSK_STEP -> Material.HUSK_SPAWN_EGG
    Sound.ENTITY_ILLUSIONER_AMBIENT, Sound.ENTITY_ILLUSIONER_CAST_SPELL, Sound.ENTITY_ILLUSIONER_DEATH, Sound.ENTITY_ILLUSIONER_HURT, Sound.ENTITY_ILLUSIONER_MIRROR_MOVE, Sound.ENTITY_ILLUSIONER_PREPARE_BLINDNESS, Sound.ENTITY_ILLUSIONER_PREPARE_MIRROR -> Material.GRAY_BANNER
    Sound.ENTITY_IRON_GOLEM_ATTACK, Sound.ENTITY_IRON_GOLEM_DAMAGE, Sound.ENTITY_IRON_GOLEM_DEATH, Sound.ENTITY_IRON_GOLEM_HURT, Sound.ENTITY_IRON_GOLEM_REPAIR, Sound.ENTITY_IRON_GOLEM_STEP -> Material.IRON_INGOT
    Sound.ENTITY_ITEM_BREAK, Sound.ENTITY_ITEM_PICKUP -> Material.CLAY_BALL
    Sound.ENTITY_ITEM_FRAME_ADD_ITEM, Sound.ENTITY_ITEM_FRAME_BREAK, Sound.ENTITY_ITEM_FRAME_PLACE, Sound.ENTITY_ITEM_FRAME_REMOVE_ITEM, Sound.ENTITY_ITEM_FRAME_ROTATE_ITEM -> Material.ITEM_FRAME
    Sound.ENTITY_LEASH_KNOT_BREAK, Sound.ENTITY_LEASH_KNOT_PLACE -> Material.LEAD
    Sound.ENTITY_LIGHTNING_BOLT_IMPACT, Sound.ENTITY_LIGHTNING_BOLT_THUNDER -> Material.GOLD_NUGGET
    Sound.ENTITY_LINGERING_POTION_THROW -> Material.LINGERING_POTION
    Sound.ENTITY_LLAMA_AMBIENT, Sound.ENTITY_LLAMA_ANGRY, Sound.ENTITY_LLAMA_CHEST, Sound.ENTITY_LLAMA_DEATH, Sound.ENTITY_LLAMA_EAT, Sound.ENTITY_LLAMA_HURT, Sound.ENTITY_LLAMA_SPIT, Sound.ENTITY_LLAMA_STEP, Sound.ENTITY_LLAMA_SWAG -> Material.LLAMA_SPAWN_EGG
    Sound.ENTITY_MAGMA_CUBE_DEATH, Sound.ENTITY_MAGMA_CUBE_DEATH_SMALL, Sound.ENTITY_MAGMA_CUBE_HURT, Sound.ENTITY_MAGMA_CUBE_HURT_SMALL, Sound.ENTITY_MAGMA_CUBE_JUMP, Sound.ENTITY_MAGMA_CUBE_SQUISH, Sound.ENTITY_MAGMA_CUBE_SQUISH_SMALL -> Material.MAGMA_CUBE_SPAWN_EGG
    Sound.ENTITY_MINECART_INSIDE, Sound.ENTITY_MINECART_RIDING -> Material.MINECART
    Sound.ENTITY_MOOSHROOM_CONVERT, Sound.ENTITY_MOOSHROOM_EAT, Sound.ENTITY_MOOSHROOM_MILK, Sound.ENTITY_MOOSHROOM_SHEAR, Sound.ENTITY_MOOSHROOM_SUSPICIOUS_MILK -> Material.MOOSHROOM_SPAWN_EGG
    Sound.ENTITY_MULE_AMBIENT, Sound.ENTITY_MULE_ANGRY, Sound.ENTITY_MULE_CHEST, Sound.ENTITY_MULE_DEATH, Sound.ENTITY_MULE_EAT, Sound.ENTITY_MULE_HURT -> Material.MULE_SPAWN_EGG
    Sound.ENTITY_OCELOT_AMBIENT, Sound.ENTITY_OCELOT_DEATH, Sound.ENTITY_OCELOT_HURT -> Material.OCELOT_SPAWN_EGG
    Sound.ENTITY_PAINTING_BREAK, Sound.ENTITY_PAINTING_PLACE -> Material.PAINTING
    Sound.ENTITY_PANDA_AGGRESSIVE_AMBIENT, Sound.ENTITY_PANDA_AMBIENT, Sound.ENTITY_PANDA_BITE, Sound.ENTITY_PANDA_CANT_BREED, Sound.ENTITY_PANDA_DEATH, Sound.ENTITY_PANDA_EAT, Sound.ENTITY_PANDA_HURT, Sound.ENTITY_PANDA_PRE_SNEEZE, Sound.ENTITY_PANDA_SNEEZE, Sound.ENTITY_PANDA_STEP, Sound.ENTITY_PANDA_WORRIED_AMBIENT -> Material.PANDA_SPAWN_EGG
    Sound.ENTITY_PARROT_AMBIENT, Sound.ENTITY_PARROT_DEATH, Sound.ENTITY_PARROT_EAT, Sound.ENTITY_PARROT_FLY, Sound.ENTITY_PARROT_HURT, Sound.ENTITY_PARROT_IMITATE_BLAZE, Sound.ENTITY_PARROT_IMITATE_CREEPER, Sound.ENTITY_PARROT_IMITATE_DROWNED, Sound.ENTITY_PARROT_IMITATE_ELDER_GUARDIAN, Sound.ENTITY_PARROT_IMITATE_ENDERMITE, Sound.ENTITY_PARROT_IMITATE_ENDER_DRAGON, Sound.ENTITY_PARROT_IMITATE_EVOKER, Sound.ENTITY_PARROT_IMITATE_GHAST, Sound.ENTITY_PARROT_IMITATE_GUARDIAN, Sound.ENTITY_PARROT_IMITATE_HOGLIN, Sound.ENTITY_PARROT_IMITATE_HUSK, Sound.ENTITY_PARROT_IMITATE_ILLUSIONER, Sound.ENTITY_PARROT_IMITATE_MAGMA_CUBE, Sound.ENTITY_PARROT_IMITATE_PHANTOM, Sound.ENTITY_PARROT_IMITATE_PIGLIN, Sound.ENTITY_PARROT_IMITATE_PIGLIN_BRUTE, Sound.ENTITY_PARROT_IMITATE_PILLAGER, Sound.ENTITY_PARROT_IMITATE_RAVAGER, Sound.ENTITY_PARROT_IMITATE_SHULKER, Sound.ENTITY_PARROT_IMITATE_SILVERFISH, Sound.ENTITY_PARROT_IMITATE_SKELETON, Sound.ENTITY_PARROT_IMITATE_SLIME, Sound.ENTITY_PARROT_IMITATE_SPIDER, Sound.ENTITY_PARROT_IMITATE_STRAY, Sound.ENTITY_PARROT_IMITATE_VEX, Sound.ENTITY_PARROT_IMITATE_VINDICATOR, Sound.ENTITY_PARROT_IMITATE_WITCH, Sound.ENTITY_PARROT_IMITATE_WITHER, Sound.ENTITY_PARROT_IMITATE_WITHER_SKELETON, Sound.ENTITY_PARROT_IMITATE_ZOGLIN, Sound.ENTITY_PARROT_IMITATE_ZOMBIE, Sound.ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER, Sound.ENTITY_PARROT_STEP -> Material.PARROT_SPAWN_EGG
    Sound.ENTITY_PHANTOM_AMBIENT, Sound.ENTITY_PHANTOM_BITE, Sound.ENTITY_PHANTOM_DEATH, Sound.ENTITY_PHANTOM_FLAP, Sound.ENTITY_PHANTOM_HURT, Sound.ENTITY_PHANTOM_SWOOP -> Material.PHANTOM_SPAWN_EGG
    Sound.ENTITY_PIGLIN_ADMIRING_ITEM, Sound.ENTITY_PIGLIN_AMBIENT, Sound.ENTITY_PIGLIN_ANGRY, Sound.ENTITY_PIGLIN_BRUTE_AMBIENT, Sound.ENTITY_PIGLIN_BRUTE_ANGRY, Sound.ENTITY_PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED, Sound.ENTITY_PIGLIN_BRUTE_DEATH, Sound.ENTITY_PIGLIN_BRUTE_HURT, Sound.ENTITY_PIGLIN_BRUTE_STEP, Sound.ENTITY_PIGLIN_CELEBRATE, Sound.ENTITY_PIGLIN_CONVERTED_TO_ZOMBIFIED, Sound.ENTITY_PIGLIN_DEATH, Sound.ENTITY_PIGLIN_HURT, Sound.ENTITY_PIGLIN_JEALOUS, Sound.ENTITY_PIGLIN_RETREAT, Sound.ENTITY_PIGLIN_STEP -> Material.PIGLIN_SPAWN_EGG
    Sound.ENTITY_PIG_AMBIENT, Sound.ENTITY_PIG_DEATH, Sound.ENTITY_PIG_HURT, Sound.ENTITY_PIG_SADDLE, Sound.ENTITY_PIG_STEP -> Material.PIG_SPAWN_EGG
    Sound.ENTITY_PILLAGER_AMBIENT, Sound.ENTITY_PILLAGER_CELEBRATE, Sound.ENTITY_PILLAGER_DEATH, Sound.ENTITY_PILLAGER_HURT -> Material.PILLAGER_SPAWN_EGG
    Sound.ENTITY_PLAYER_ATTACK_CRIT, Sound.ENTITY_PLAYER_ATTACK_KNOCKBACK, Sound.ENTITY_PLAYER_ATTACK_NODAMAGE, Sound.ENTITY_PLAYER_ATTACK_STRONG, Sound.ENTITY_PLAYER_ATTACK_SWEEP, Sound.ENTITY_PLAYER_ATTACK_WEAK, Sound.ENTITY_PLAYER_BIG_FALL, Sound.ENTITY_PLAYER_BREATH, Sound.ENTITY_PLAYER_BURP, Sound.ENTITY_PLAYER_DEATH, Sound.ENTITY_PLAYER_HURT, Sound.ENTITY_PLAYER_HURT_DROWN, Sound.ENTITY_PLAYER_HURT_ON_FIRE, Sound.ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH, Sound.ENTITY_PLAYER_LEVELUP, Sound.ENTITY_PLAYER_SMALL_FALL, Sound.ENTITY_PLAYER_SPLASH, Sound.ENTITY_PLAYER_SPLASH_HIGH_SPEED, Sound.ENTITY_PLAYER_SWIM -> Material.PLAYER_HEAD
    Sound.ENTITY_POLAR_BEAR_AMBIENT, Sound.ENTITY_POLAR_BEAR_AMBIENT_BABY, Sound.ENTITY_POLAR_BEAR_DEATH, Sound.ENTITY_POLAR_BEAR_HURT, Sound.ENTITY_POLAR_BEAR_STEP, Sound.ENTITY_POLAR_BEAR_WARNING -> Material.POLAR_BEAR_SPAWN_EGG
    Sound.ENTITY_PUFFER_FISH_AMBIENT, Sound.ENTITY_PUFFER_FISH_BLOW_OUT, Sound.ENTITY_PUFFER_FISH_BLOW_UP, Sound.ENTITY_PUFFER_FISH_DEATH, Sound.ENTITY_PUFFER_FISH_FLOP, Sound.ENTITY_PUFFER_FISH_HURT, Sound.ENTITY_PUFFER_FISH_STING -> Material.PUFFERFISH_SPAWN_EGG
    Sound.ENTITY_RABBIT_AMBIENT, Sound.ENTITY_RABBIT_ATTACK, Sound.ENTITY_RABBIT_DEATH, Sound.ENTITY_RABBIT_HURT, Sound.ENTITY_RABBIT_JUMP -> Material.RABBIT_SPAWN_EGG
    Sound.ENTITY_RAVAGER_AMBIENT, Sound.ENTITY_RAVAGER_ATTACK, Sound.ENTITY_RAVAGER_CELEBRATE, Sound.ENTITY_RAVAGER_DEATH, Sound.ENTITY_RAVAGER_HURT, Sound.ENTITY_RAVAGER_ROAR, Sound.ENTITY_RAVAGER_STEP, Sound.ENTITY_RAVAGER_STUNNED -> Material.RAVAGER_SPAWN_EGG
    Sound.ENTITY_SALMON_AMBIENT, Sound.ENTITY_SALMON_DEATH, Sound.ENTITY_SALMON_FLOP, Sound.ENTITY_SALMON_HURT -> Material.SALMON_SPAWN_EGG
    Sound.ENTITY_SHEEP_AMBIENT, Sound.ENTITY_SHEEP_DEATH, Sound.ENTITY_SHEEP_HURT, Sound.ENTITY_SHEEP_SHEAR, Sound.ENTITY_SHEEP_STEP -> Material.SHEEP_SPAWN_EGG
    Sound.ENTITY_SHULKER_AMBIENT, Sound.ENTITY_SHULKER_BULLET_HIT, Sound.ENTITY_SHULKER_BULLET_HURT, Sound.ENTITY_SHULKER_CLOSE, Sound.ENTITY_SHULKER_DEATH, Sound.ENTITY_SHULKER_HURT, Sound.ENTITY_SHULKER_HURT_CLOSED, Sound.ENTITY_SHULKER_OPEN, Sound.ENTITY_SHULKER_SHOOT, Sound.ENTITY_SHULKER_TELEPORT -> Material.SHULKER_SPAWN_EGG
    Sound.ENTITY_SILVERFISH_AMBIENT, Sound.ENTITY_SILVERFISH_DEATH, Sound.ENTITY_SILVERFISH_HURT, Sound.ENTITY_SILVERFISH_STEP -> Material.SILVERFISH_SPAWN_EGG
    Sound.ENTITY_SKELETON_AMBIENT, Sound.ENTITY_SKELETON_DEATH, Sound.ENTITY_SKELETON_HORSE_AMBIENT, Sound.ENTITY_SKELETON_HORSE_AMBIENT_WATER, Sound.ENTITY_SKELETON_HORSE_DEATH, Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER, Sound.ENTITY_SKELETON_HORSE_HURT, Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, Sound.ENTITY_SKELETON_HORSE_STEP_WATER, Sound.ENTITY_SKELETON_HORSE_SWIM, Sound.ENTITY_SKELETON_HURT, Sound.ENTITY_SKELETON_SHOOT, Sound.ENTITY_SKELETON_STEP -> Material.SKELETON_SPAWN_EGG
    Sound.ENTITY_SLIME_ATTACK, Sound.ENTITY_SLIME_DEATH, Sound.ENTITY_SLIME_DEATH_SMALL, Sound.ENTITY_SLIME_HURT, Sound.ENTITY_SLIME_HURT_SMALL, Sound.ENTITY_SLIME_JUMP, Sound.ENTITY_SLIME_JUMP_SMALL, Sound.ENTITY_SLIME_SQUISH, Sound.ENTITY_SLIME_SQUISH_SMALL -> Material.SLIME_SPAWN_EGG
    Sound.ENTITY_SNOWBALL_THROW, Sound.ENTITY_SNOW_GOLEM_AMBIENT, Sound.ENTITY_SNOW_GOLEM_DEATH, Sound.ENTITY_SNOW_GOLEM_HURT, Sound.ENTITY_SNOW_GOLEM_SHEAR, Sound.ENTITY_SNOW_GOLEM_SHOOT -> Material.SNOWBALL
    Sound.ENTITY_SPIDER_AMBIENT, Sound.ENTITY_SPIDER_DEATH, Sound.ENTITY_SPIDER_HURT, Sound.ENTITY_SPIDER_STEP -> Material.SPIDER_SPAWN_EGG
    Sound.ENTITY_SPLASH_POTION_BREAK, Sound.ENTITY_SPLASH_POTION_THROW -> Material.SPLASH_POTION
    Sound.ENTITY_SQUID_AMBIENT, Sound.ENTITY_SQUID_DEATH, Sound.ENTITY_SQUID_HURT, Sound.ENTITY_SQUID_SQUIRT -> Material.SQUID_SPAWN_EGG
    Sound.ENTITY_STRAY_AMBIENT, Sound.ENTITY_STRAY_DEATH, Sound.ENTITY_STRAY_HURT, Sound.ENTITY_STRAY_STEP -> Material.STRAY_SPAWN_EGG
    Sound.ENTITY_STRIDER_AMBIENT, Sound.ENTITY_STRIDER_DEATH, Sound.ENTITY_STRIDER_EAT, Sound.ENTITY_STRIDER_HAPPY, Sound.ENTITY_STRIDER_HURT, Sound.ENTITY_STRIDER_RETREAT, Sound.ENTITY_STRIDER_SADDLE, Sound.ENTITY_STRIDER_STEP, Sound.ENTITY_STRIDER_STEP_LAVA -> Material.STRIDER_SPAWN_EGG
    Sound.ENTITY_TNT_PRIMED -> Material.TNT
    Sound.ENTITY_TROPICAL_FISH_AMBIENT, Sound.ENTITY_TROPICAL_FISH_DEATH, Sound.ENTITY_TROPICAL_FISH_FLOP, Sound.ENTITY_TROPICAL_FISH_HURT -> Material.TROPICAL_FISH_SPAWN_EGG
    Sound.ENTITY_TURTLE_AMBIENT_LAND, Sound.ENTITY_TURTLE_DEATH, Sound.ENTITY_TURTLE_DEATH_BABY, Sound.ENTITY_TURTLE_EGG_BREAK, Sound.ENTITY_TURTLE_EGG_CRACK, Sound.ENTITY_TURTLE_EGG_HATCH, Sound.ENTITY_TURTLE_HURT, Sound.ENTITY_TURTLE_HURT_BABY, Sound.ENTITY_TURTLE_LAY_EGG, Sound.ENTITY_TURTLE_SHAMBLE, Sound.ENTITY_TURTLE_SHAMBLE_BABY, Sound.ENTITY_TURTLE_SWIM -> Material.TURTLE_SPAWN_EGG
    Sound.ENTITY_VEX_AMBIENT, Sound.ENTITY_VEX_CHARGE, Sound.ENTITY_VEX_DEATH, Sound.ENTITY_VEX_HURT -> Material.VEX_SPAWN_EGG
    Sound.ENTITY_VILLAGER_AMBIENT, Sound.ENTITY_VILLAGER_CELEBRATE, Sound.ENTITY_VILLAGER_DEATH, Sound.ENTITY_VILLAGER_HURT, Sound.ENTITY_VILLAGER_NO, Sound.ENTITY_VILLAGER_TRADE, Sound.ENTITY_VILLAGER_WORK_ARMORER, Sound.ENTITY_VILLAGER_WORK_BUTCHER, Sound.ENTITY_VILLAGER_WORK_CARTOGRAPHER, Sound.ENTITY_VILLAGER_WORK_CLERIC, Sound.ENTITY_VILLAGER_WORK_FARMER, Sound.ENTITY_VILLAGER_WORK_FISHERMAN, Sound.ENTITY_VILLAGER_WORK_FLETCHER, Sound.ENTITY_VILLAGER_WORK_LEATHERWORKER, Sound.ENTITY_VILLAGER_WORK_LIBRARIAN, Sound.ENTITY_VILLAGER_WORK_MASON, Sound.ENTITY_VILLAGER_WORK_SHEPHERD, Sound.ENTITY_VILLAGER_WORK_TOOLSMITH, Sound.ENTITY_VILLAGER_WORK_WEAPONSMITH, Sound.ENTITY_VILLAGER_YES -> Material.VILLAGER_SPAWN_EGG
    Sound.ENTITY_VINDICATOR_AMBIENT, Sound.ENTITY_VINDICATOR_CELEBRATE, Sound.ENTITY_VINDICATOR_DEATH, Sound.ENTITY_VINDICATOR_HURT -> Material.VINDICATOR_SPAWN_EGG
    Sound.ENTITY_WANDERING_TRADER_AMBIENT, Sound.ENTITY_WANDERING_TRADER_DEATH, Sound.ENTITY_WANDERING_TRADER_DISAPPEARED, Sound.ENTITY_WANDERING_TRADER_DRINK_MILK, Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, Sound.ENTITY_WANDERING_TRADER_HURT, Sound.ENTITY_WANDERING_TRADER_NO, Sound.ENTITY_WANDERING_TRADER_REAPPEARED, Sound.ENTITY_WANDERING_TRADER_TRADE, Sound.ENTITY_WANDERING_TRADER_YES -> Material.WANDERING_TRADER_SPAWN_EGG
    Sound.ENTITY_WITCH_AMBIENT, Sound.ENTITY_WITCH_CELEBRATE, Sound.ENTITY_WITCH_DEATH, Sound.ENTITY_WITCH_DRINK, Sound.ENTITY_WITCH_HURT, Sound.ENTITY_WITCH_THROW -> Material.WITCH_SPAWN_EGG
    Sound.ENTITY_WITHER_AMBIENT, Sound.ENTITY_WITHER_BREAK_BLOCK, Sound.ENTITY_WITHER_DEATH, Sound.ENTITY_WITHER_HURT, Sound.ENTITY_WITHER_SHOOT, Sound.ENTITY_WITHER_SPAWN -> Material.WITHER_SKELETON_SKULL
    Sound.ENTITY_WITHER_SKELETON_AMBIENT, Sound.ENTITY_WITHER_SKELETON_DEATH, Sound.ENTITY_WITHER_SKELETON_HURT, Sound.ENTITY_WITHER_SKELETON_STEP -> Material.WITHER_SKELETON_SPAWN_EGG
    Sound.ENTITY_WOLF_AMBIENT, Sound.ENTITY_WOLF_DEATH, Sound.ENTITY_WOLF_GROWL, Sound.ENTITY_WOLF_HOWL, Sound.ENTITY_WOLF_HURT, Sound.ENTITY_WOLF_PANT, Sound.ENTITY_WOLF_SHAKE, Sound.ENTITY_WOLF_STEP, Sound.ENTITY_WOLF_WHINE -> Material.WOLF_SPAWN_EGG
    Sound.ENTITY_ZOGLIN_AMBIENT, Sound.ENTITY_ZOGLIN_ANGRY, Sound.ENTITY_ZOGLIN_ATTACK, Sound.ENTITY_ZOGLIN_DEATH, Sound.ENTITY_ZOGLIN_HURT, Sound.ENTITY_ZOGLIN_STEP -> Material.ZOGLIN_SPAWN_EGG
    Sound.ENTITY_ZOMBIE_AMBIENT, Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, Sound.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, Sound.ENTITY_ZOMBIE_BREAK_WOODEN_DOOR, Sound.ENTITY_ZOMBIE_CONVERTED_TO_DROWNED, Sound.ENTITY_ZOMBIE_DEATH, Sound.ENTITY_ZOMBIE_DESTROY_EGG, Sound.ENTITY_ZOMBIE_HORSE_AMBIENT, Sound.ENTITY_ZOMBIE_HORSE_DEATH, Sound.ENTITY_ZOMBIE_HORSE_HURT, Sound.ENTITY_ZOMBIE_HURT, Sound.ENTITY_ZOMBIE_INFECT, Sound.ENTITY_ZOMBIE_STEP, Sound.ENTITY_ZOMBIE_VILLAGER_AMBIENT, Sound.ENTITY_ZOMBIE_VILLAGER_CONVERTED, Sound.ENTITY_ZOMBIE_VILLAGER_CURE, Sound.ENTITY_ZOMBIE_VILLAGER_DEATH, Sound.ENTITY_ZOMBIE_VILLAGER_HURT, Sound.ENTITY_ZOMBIE_VILLAGER_STEP -> Material.ZOMBIE_SPAWN_EGG
    Sound.ENTITY_ZOMBIFIED_PIGLIN_AMBIENT, Sound.ENTITY_ZOMBIFIED_PIGLIN_ANGRY, Sound.ENTITY_ZOMBIFIED_PIGLIN_DEATH, Sound.ENTITY_ZOMBIFIED_PIGLIN_HURT -> Material.ZOMBIFIED_PIGLIN_SPAWN_EGG
    Sound.EVENT_RAID_HORN -> Material.GRAY_BANNER
    Sound.ITEM_ARMOR_EQUIP_CHAIN -> Material.CHAINMAIL_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_DIAMOND -> Material.DIAMOND_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_ELYTRA -> Material.ELYTRA
    Sound.ITEM_ARMOR_EQUIP_GENERIC -> Material.LEATHER_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_GOLD -> Material.GOLDEN_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_IRON -> Material.IRON_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_LEATHER -> Material.LEATHER_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_NETHERITE -> Material.NETHERITE_CHESTPLATE
    Sound.ITEM_ARMOR_EQUIP_TURTLE -> Material.TURTLE_HELMET
    Sound.ITEM_AXE_STRIP -> Material.STONE_AXE
    Sound.ITEM_BOOK_PAGE_TURN, Sound.ITEM_BOOK_PUT -> Material.BOOK
    Sound.ITEM_BOTTLE_EMPTY, Sound.ITEM_BOTTLE_FILL, Sound.ITEM_BOTTLE_FILL_DRAGONBREATH -> Material.GLASS_BOTTLE
    Sound.ITEM_BUCKET_EMPTY, Sound.ITEM_BUCKET_FILL -> Material.WATER_BUCKET
    Sound.ITEM_BUCKET_EMPTY_FISH, Sound.ITEM_BUCKET_FILL_FISH -> Material.COD_BUCKET
    Sound.ITEM_BUCKET_EMPTY_LAVA, Sound.ITEM_BUCKET_FILL_LAVA -> Material.LAVA_BUCKET
    Sound.ITEM_CHORUS_FRUIT_TELEPORT -> Material.CHORUS_FRUIT
    Sound.ITEM_CROP_PLANT -> Material.WHEAT_SEEDS
    Sound.ITEM_CROSSBOW_HIT, Sound.ITEM_CROSSBOW_LOADING_END, Sound.ITEM_CROSSBOW_LOADING_MIDDLE, Sound.ITEM_CROSSBOW_LOADING_START, Sound.ITEM_CROSSBOW_QUICK_CHARGE_1, Sound.ITEM_CROSSBOW_QUICK_CHARGE_2, Sound.ITEM_CROSSBOW_QUICK_CHARGE_3, Sound.ITEM_CROSSBOW_SHOOT -> Material.CROSSBOW
    Sound.ITEM_ELYTRA_FLYING -> Material.ELYTRA
    Sound.ITEM_FIRECHARGE_USE -> Material.FIRE_CHARGE
    Sound.ITEM_FLINTANDSTEEL_USE -> Material.FLINT_AND_STEEL
    Sound.ITEM_HOE_TILL -> Material.STONE_HOE
    Sound.ITEM_HONEY_BOTTLE_DRINK -> Material.HONEY_BOTTLE
    Sound.ITEM_LODESTONE_COMPASS_LOCK -> Material.LODESTONE
    Sound.ITEM_NETHER_WART_PLANT -> Material.NETHER_WART
    Sound.ITEM_SHIELD_BLOCK, Sound.ITEM_SHIELD_BREAK -> Material.SHIELD
    Sound.ITEM_SHOVEL_FLATTEN -> Material.STONE_SHOVEL
    Sound.ITEM_SWEET_BERRIES_PICK_FROM_BUSH -> Material.SWEET_BERRIES
    Sound.ITEM_TOTEM_USE -> Material.TOTEM_OF_UNDYING
    Sound.ITEM_TRIDENT_HIT, Sound.ITEM_TRIDENT_HIT_GROUND, Sound.ITEM_TRIDENT_RETURN, Sound.ITEM_TRIDENT_RIPTIDE_1, Sound.ITEM_TRIDENT_RIPTIDE_2, Sound.ITEM_TRIDENT_RIPTIDE_3, Sound.ITEM_TRIDENT_THROW, Sound.ITEM_TRIDENT_THUNDER -> Material.TRIDENT
    Sound.MUSIC_CREATIVE -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_CREDITS -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_DISC_11 -> Material.MUSIC_DISC_11
    Sound.MUSIC_DISC_13 -> Material.MUSIC_DISC_13
    Sound.MUSIC_DISC_BLOCKS -> Material.MUSIC_DISC_BLOCKS
    Sound.MUSIC_DISC_CAT -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_DISC_CHIRP -> Material.MUSIC_DISC_CHIRP
    Sound.MUSIC_DISC_FAR -> Material.MUSIC_DISC_FAR
    Sound.MUSIC_DISC_MALL -> Material.MUSIC_DISC_MALL
    Sound.MUSIC_DISC_MELLOHI -> Material.MUSIC_DISC_MELLOHI
    Sound.MUSIC_DISC_PIGSTEP -> Material.MUSIC_DISC_PIGSTEP
    Sound.MUSIC_DISC_STAL -> Material.MUSIC_DISC_STAL
    Sound.MUSIC_DISC_STRAD -> Material.MUSIC_DISC_STRAD
    Sound.MUSIC_DISC_WAIT -> Material.MUSIC_DISC_WAIT
    Sound.MUSIC_DISC_WARD -> Material.MUSIC_DISC_WARD
    Sound.MUSIC_DRAGON -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_END -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_GAME -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_MENU -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_NETHER_BASALT_DELTAS -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_NETHER_CRIMSON_FOREST -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_NETHER_NETHER_WASTES -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_NETHER_SOUL_SAND_VALLEY -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_NETHER_WARPED_FOREST -> Material.MUSIC_DISC_CAT
    Sound.MUSIC_UNDER_WATER -> Material.MUSIC_DISC_CAT
    Sound.PARTICLE_SOUL_ESCAPE -> Material.SOUL_SAND
    Sound.UI_BUTTON_CLICK, Sound.UI_CARTOGRAPHY_TABLE_TAKE_RESULT, Sound.UI_LOOM_SELECT_PATTERN, Sound.UI_LOOM_TAKE_RESULT, Sound.UI_STONECUTTER_SELECT_RECIPE, Sound.UI_STONECUTTER_TAKE_RESULT, Sound.UI_TOAST_CHALLENGE_COMPLETE, Sound.UI_TOAST_IN, Sound.UI_TOAST_OUT -> Material.LEATHER
    Sound.WEATHER_RAIN, Sound.WEATHER_RAIN_ABOVE -> Material.LAPIS_LAZULI
}
