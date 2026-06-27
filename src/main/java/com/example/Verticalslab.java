package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;

public class Verticalslab implements ModInitializer {
    public static final String MOD_ID = "vertical-slab";

    // ── Wood slabs ──────────────────────────────────────────────
    public static final Block VERTICAL_OAK_SLAB = register("vertical_oak_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_SPRUCE_SLAB = register("vertical_spruce_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_BIRCH_SLAB = register("vertical_birch_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_JUNGLE_SLAB = register("vertical_jungle_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_ACACIA_SLAB = register("vertical_acacia_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_DARK_OAK_SLAB = register("vertical_dark_oak_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_MANGROVE_OAK_SLAB = register("vertical_mangrove_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_CHERRY_SLAB = register("vertical_cherry_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_PALE_OAK_SLAB = register("vertical_pale_oak_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.WOOD));
    public static final Block VERTICAL_BAMBOO_SLAB = register("vertical_bamboo_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.BAMBOO_WOOD));
    public static final Block VERTICAL_CRIMSON_SLAB = register("vertical_crimson_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.NETHER_WOOD));
    public static final Block VERTICAL_WARPED_SLAB = register("vertical_warped_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASS).strength(0.5f).sound(SoundType.BAMBOO_WOOD));

    // ── Stone & mineral slabs ───────────────────────────────────
    public static final Block VERTICAL_STONE_SLAB = register("vertical_stone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(1f));
    public static final Block VERTICAL_COBBLESTONE_SLAB = register("vertical_cobblestone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = register("vertical_mossy_cobblestone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = register("vertical_smooth_stone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_QUARTZ_BLOCK_SLAB = register("vertical_quartz_block_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = register("vertical_smooth_quartz_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    // Prismarine
    public static final Block VERTICAL_PRISMARINE_SLAB = register("vertical_prismarine_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = register("vertical_dark_prismarine_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_PRISMARINE_BRICKS_SLAB = register("vertical_prismarine_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    // Nether brick
    public static final Block VERTICAL_NETHER_BRICKS_SLAB = register("vertical_nether_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_RED_NETHER_BRICKS_SLAB = register("vertical_red_nether_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    // Blackstone
    public static final Block VERTICAL_BLACKSTONE_SLAB = register("vertical_blackstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = register("vertical_polished_blackstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB = register("vertical_polished_blackstone_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    public static final Block VERTICAL_STONE_BRICKS_SLAB = register("vertical_stone_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_SLAB = register("vertical_mossy_stone_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_GRANITE_SLAB = register("vertical_granite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_DIORITE_SLAB = register("vertical_diorite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_ANDESITE_SLAB = register("vertical_andesite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_DEEPSLATE_SLAB = register("vertical_deepslate_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = register("vertical_polished_granite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = register("vertical_polished_diorite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = register("vertical_polished_andesite_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = register("vertical_polished_deepslate_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    public static final Block VERTICAL_DEEPSLATE_BRICKS_SLAB = register("vertical_deepslate_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_DEEPSLATE_TILES_SLAB = register("vertical_deepslate_tiles_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_TUFF_SLAB = register("vertical_tuff_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_POLISHED_TUFF_SLAB = register("vertical_polished_tuff_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_TUFF_BRICKS_SLAB = register("vertical_tuff_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    // End stone / Brick / Mud / Purpur
    public static final Block VERTICAL_END_STONE_BRICKS_SLAB = register("vertical_end_stone_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_BRICKS_SLAB = register("vertical_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_MUD_BRICKS_SLAB = register("vertical_mud_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_PURPUR_BRICKS_SLAB = register("vertical_purpur_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    // Sandstone
    public static final Block VERTICAL_SANDSTONE_SLAB = register("vertical_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = register("vertical_smooth_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = register("vertical_cut_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_RED_SANDSTONE_SLAB = register("vertical_red_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = register("vertical_smooth_red_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = register("vertical_cut_red_sandstone_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    // Resin brick
    public static final Block VERTICAL_RESIN_BRICKS_SLAB = register("vertical_resin_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    // Copper
    public static final Block VERTICAL_CUT_COPPER_SLAB = register("vertical_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = register("vertical_exposed_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = register("vertical_weathered_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = register("vertical_oxidized_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    // Cinnabar (1.26.2)
    public static final Block VERTICAL_CINNABAR_SLAB = register("vertical_cinnabar_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));
    public static final Block VERTICAL_POLISHED_CINNABAR_SLAB = register("vertical_polished_cinnabar_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));
    public static final Block VERTICAL_CINNABAR_BRICKS_SLAB = register("vertical_cinnabar_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));

    // Sulfur (1.26.2)
    public static final Block VERTICAL_SULFUR_SLAB = register("vertical_sulfur_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));
    public static final Block VERTICAL_POLISHED_SULFUR_SLAB = register("vertical_polished_sulfur_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));
    public static final Block VERTICAL_SULFUR_BRICKS_SLAB = register("vertical_sulfur_bricks_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5f));

    // Waxed copper
    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = register("vertical_waxed_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = register("vertical_waxed_exposed_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = register("vertical_waxed_weathered_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = register("vertical_waxed_oxidized_cut_copper_slab",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.0f));

    private static Block register(String path, BlockBehaviour.Properties settings) {
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, path));
        Block block = Registry.register(BuiltInRegistries.BLOCK, blockKey, new VerticalSlabBlock(settings.setId(blockKey)));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));
        Registry.register(BuiltInRegistries.ITEM, itemKey, new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix()));
        return block;
    }

    public static final ResourceKey<CreativeModeTab> VERTICAL_SLAB_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "vertical_slab"));

    // All registered slabs in creative inventory display order
    private static final Block[] CREATIVE_TAB_ITEMS = {
            VERTICAL_OAK_SLAB, VERTICAL_SPRUCE_SLAB, VERTICAL_BIRCH_SLAB, VERTICAL_JUNGLE_SLAB,
            VERTICAL_ACACIA_SLAB, VERTICAL_DARK_OAK_SLAB, VERTICAL_MANGROVE_OAK_SLAB,
            VERTICAL_PALE_OAK_SLAB, VERTICAL_CHERRY_SLAB, VERTICAL_BAMBOO_SLAB,
            VERTICAL_CRIMSON_SLAB, VERTICAL_WARPED_SLAB,
            VERTICAL_STONE_SLAB, VERTICAL_COBBLESTONE_SLAB, VERTICAL_MOSSY_COBBLESTONE_SLAB,
            VERTICAL_SMOOTH_STONE_SLAB, VERTICAL_QUARTZ_BLOCK_SLAB, VERTICAL_SMOOTH_QUARTZ_SLAB,
            VERTICAL_STONE_BRICKS_SLAB, VERTICAL_MOSSY_STONE_BRICKS_SLAB,
            VERTICAL_GRANITE_SLAB, VERTICAL_DIORITE_SLAB, VERTICAL_ANDESITE_SLAB, VERTICAL_DEEPSLATE_SLAB,
            VERTICAL_POLISHED_GRANITE_SLAB, VERTICAL_POLISHED_DIORITE_SLAB,
            VERTICAL_POLISHED_ANDESITE_SLAB, VERTICAL_POLISHED_DEEPSLATE_SLAB,
            VERTICAL_DEEPSLATE_BRICKS_SLAB, VERTICAL_DEEPSLATE_TILES_SLAB,
            VERTICAL_TUFF_SLAB, VERTICAL_POLISHED_TUFF_SLAB, VERTICAL_TUFF_BRICKS_SLAB,
            VERTICAL_BRICKS_SLAB, VERTICAL_MUD_BRICKS_SLAB, VERTICAL_PURPUR_BRICKS_SLAB,
            VERTICAL_SANDSTONE_SLAB, VERTICAL_SMOOTH_SANDSTONE_SLAB, VERTICAL_CUT_SANDSTONE_SLAB,
            VERTICAL_RED_SANDSTONE_SLAB, VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, VERTICAL_CUT_RED_SANDSTONE_SLAB,
            VERTICAL_RESIN_BRICKS_SLAB,
            VERTICAL_PRISMARINE_SLAB, VERTICAL_DARK_PRISMARINE_SLAB, VERTICAL_PRISMARINE_BRICKS_SLAB,
            VERTICAL_NETHER_BRICKS_SLAB, VERTICAL_RED_NETHER_BRICKS_SLAB,
            VERTICAL_BLACKSTONE_SLAB, VERTICAL_POLISHED_BLACKSTONE_SLAB, VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB,
            VERTICAL_CUT_COPPER_SLAB, VERTICAL_EXPOSED_CUT_COPPER_SLAB,
            VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_OXIDIZED_CUT_COPPER_SLAB,
            VERTICAL_WAXED_CUT_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB,
            VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB,
            VERTICAL_CINNABAR_SLAB, VERTICAL_POLISHED_CINNABAR_SLAB, VERTICAL_CINNABAR_BRICKS_SLAB,
            VERTICAL_SULFUR_SLAB, VERTICAL_POLISHED_SULFUR_SLAB, VERTICAL_SULFUR_BRICKS_SLAB,
    };

    private static final CreativeModeTab ITEM_GROUP = FabricCreativeModeTab.builder()
            .title(Component.translatable("vertical_slab"))
            .icon(() -> new ItemStack(VERTICAL_OAK_SLAB))
            .displayItems((displayContext, entries) -> {
                for (Block slab : CREATIVE_TAB_ITEMS) {
                    entries.accept(slab);
                }
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, VERTICAL_SLAB_TAB_KEY, ITEM_GROUP);

        // Insert vertical slabs into the vanilla building blocks tab, placing each
        // right after its corresponding vanilla block so the inventory stays organized.
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            // Planks
            output.insertAfter(Blocks.OAK_PLANKS, VERTICAL_OAK_SLAB);
            output.insertAfter(Blocks.SPRUCE_PLANKS, VERTICAL_SPRUCE_SLAB);
            output.insertAfter(Blocks.BIRCH_PLANKS, VERTICAL_BIRCH_SLAB);
            output.insertAfter(Blocks.JUNGLE_PLANKS, VERTICAL_JUNGLE_SLAB);
            output.insertAfter(Blocks.ACACIA_PLANKS, VERTICAL_ACACIA_SLAB);
            output.insertAfter(Blocks.DARK_OAK_PLANKS, VERTICAL_DARK_OAK_SLAB);
            output.insertAfter(Blocks.MANGROVE_PLANKS, VERTICAL_MANGROVE_OAK_SLAB);
            output.insertAfter(Blocks.PALE_OAK_PLANKS, VERTICAL_PALE_OAK_SLAB);
            output.insertAfter(Blocks.CHERRY_PLANKS, VERTICAL_CHERRY_SLAB);
            output.insertAfter(Blocks.BAMBOO_PLANKS, VERTICAL_BAMBOO_SLAB);
            output.insertAfter(Blocks.CRIMSON_PLANKS, VERTICAL_CRIMSON_SLAB);
            output.insertAfter(Blocks.WARPED_PLANKS, VERTICAL_WARPED_SLAB);

            // Stone
            output.insertAfter(Blocks.STONE, VERTICAL_STONE_SLAB);
            output.insertAfter(Blocks.COBBLESTONE, VERTICAL_COBBLESTONE_SLAB);
            output.insertAfter(Blocks.MOSSY_COBBLESTONE, VERTICAL_MOSSY_COBBLESTONE_SLAB);
            output.insertAfter(Blocks.SMOOTH_STONE, VERTICAL_SMOOTH_STONE_SLAB);
            output.insertAfter(Blocks.QUARTZ_BLOCK, VERTICAL_QUARTZ_BLOCK_SLAB);
            output.insertAfter(Blocks.SMOOTH_QUARTZ, VERTICAL_SMOOTH_QUARTZ_SLAB);

            // Stone brick & variants
            output.insertAfter(Blocks.STONE_BRICKS, VERTICAL_STONE_BRICKS_SLAB);
            output.insertAfter(Blocks.MOSSY_STONE_BRICKS, VERTICAL_MOSSY_STONE_BRICKS_SLAB);
            output.insertAfter(Blocks.GRANITE, VERTICAL_GRANITE_SLAB);
            output.insertAfter(Blocks.POLISHED_GRANITE, VERTICAL_POLISHED_GRANITE_SLAB);
            output.insertAfter(Blocks.DIORITE, VERTICAL_DIORITE_SLAB);
            output.insertAfter(Blocks.POLISHED_DIORITE, VERTICAL_POLISHED_DIORITE_SLAB);
            output.insertAfter(Blocks.ANDESITE, VERTICAL_ANDESITE_SLAB);
            output.insertAfter(Blocks.POLISHED_ANDESITE, VERTICAL_POLISHED_ANDESITE_SLAB);
            output.insertAfter(Blocks.DEEPSLATE, VERTICAL_DEEPSLATE_SLAB);
            output.insertAfter(Blocks.POLISHED_DEEPSLATE, VERTICAL_POLISHED_DEEPSLATE_SLAB);
            output.insertAfter(Blocks.DEEPSLATE_BRICKS, VERTICAL_DEEPSLATE_BRICKS_SLAB);
            output.insertAfter(Blocks.DEEPSLATE_TILES, VERTICAL_DEEPSLATE_TILES_SLAB);
            output.insertAfter(Blocks.TUFF, VERTICAL_TUFF_SLAB);
            output.insertAfter(Blocks.POLISHED_TUFF, VERTICAL_POLISHED_TUFF_SLAB);
            output.insertAfter(Blocks.TUFF_BRICKS, VERTICAL_TUFF_BRICKS_SLAB);

            // Prismarine
            output.insertAfter(Blocks.PRISMARINE, VERTICAL_PRISMARINE_SLAB);
            output.insertAfter(Blocks.DARK_PRISMARINE, VERTICAL_DARK_PRISMARINE_SLAB);
            output.insertAfter(Blocks.PRISMARINE_BRICKS, VERTICAL_PRISMARINE_BRICKS_SLAB);

            // Nether brick
            output.insertAfter(Blocks.NETHER_BRICKS, VERTICAL_NETHER_BRICKS_SLAB);
            output.insertAfter(Blocks.RED_NETHER_BRICKS, VERTICAL_RED_NETHER_BRICKS_SLAB);

            // Blackstone
            output.insertAfter(Blocks.BLACKSTONE, VERTICAL_BLACKSTONE_SLAB);
            output.insertAfter(Blocks.POLISHED_BLACKSTONE, VERTICAL_POLISHED_BLACKSTONE_SLAB);
            output.insertAfter(Blocks.POLISHED_BLACKSTONE_BRICKS, VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB);

            // End stone / Brick / Mud / Purpur
            output.insertAfter(Blocks.END_STONE_BRICKS, VERTICAL_END_STONE_BRICKS_SLAB);
            output.insertAfter(Blocks.BRICKS, VERTICAL_BRICKS_SLAB);
            output.insertAfter(Blocks.MUD_BRICKS, VERTICAL_MUD_BRICKS_SLAB);
            output.insertAfter(Blocks.PURPUR_PILLAR, VERTICAL_PURPUR_BRICKS_SLAB);

            // Sandstone
            output.insertAfter(Blocks.SANDSTONE, VERTICAL_SANDSTONE_SLAB);
            output.insertAfter(Blocks.SMOOTH_SANDSTONE, VERTICAL_SMOOTH_SANDSTONE_SLAB);
            output.insertAfter(Blocks.CUT_SANDSTONE, VERTICAL_CUT_SANDSTONE_SLAB);
            output.insertAfter(Blocks.RED_SANDSTONE, VERTICAL_RED_SANDSTONE_SLAB);
            output.insertAfter(Blocks.SMOOTH_RED_SANDSTONE, VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
            output.insertAfter(Blocks.CUT_RED_SANDSTONE, VERTICAL_CUT_RED_SANDSTONE_SLAB);

            // Copper (1.26.2 uses WeatheringCopperCollection for CUT_COPPER)
            output.insertAfter(Blocks.CUT_COPPER.weathering().unaffected(), VERTICAL_CUT_COPPER_SLAB);
            output.insertAfter(Blocks.CUT_COPPER.weathering().exposed(), VERTICAL_EXPOSED_CUT_COPPER_SLAB);
            output.insertAfter(Blocks.CUT_COPPER.weathering().weathered(), VERTICAL_WEATHERED_CUT_COPPER_SLAB);
            output.insertAfter(Blocks.CUT_COPPER.weathering().oxidized(), VERTICAL_OXIDIZED_CUT_COPPER_SLAB);

            // Cinnabar & Sulfur (1.26.2)
            output.insertAfter(Blocks.CINNABAR, VERTICAL_CINNABAR_SLAB);
            output.insertAfter(Blocks.POLISHED_CINNABAR, VERTICAL_POLISHED_CINNABAR_SLAB);
            output.insertAfter(Blocks.CINNABAR_BRICKS, VERTICAL_CINNABAR_BRICKS_SLAB);
            output.insertAfter(Blocks.SULFUR, VERTICAL_SULFUR_SLAB);
            output.insertAfter(Blocks.POLISHED_SULFUR, VERTICAL_POLISHED_SULFUR_SLAB);
            output.insertAfter(Blocks.SULFUR_BRICKS, VERTICAL_SULFUR_BRICKS_SLAB);
        });
    }

    // ── Vertical slab block implementation ──────────────────────

    public static class VerticalSlabBlock extends Block {
        public static final EnumProperty<Direction> FACING =
                EnumProperty.create("facing", Direction.class, Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST);
        public static final BooleanProperty DOUBLE = BooleanProperty.create("double");

        protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
        protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
        protected static final VoxelShape EAST_SHAPE  = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
        protected static final VoxelShape WEST_SHAPE  = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        protected static final VoxelShape FULL_SHAPE  = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

        public VerticalSlabBlock(BlockBehaviour.Properties settings) {
            super(settings);
            registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(DOUBLE, false));
        }

        @Override
        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
            builder.add(FACING, DOUBLE);
        }

        @Override
        public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
            if (state.getValue(DOUBLE)) {
                return FULL_SHAPE;
            }
            return switch (state.getValue(FACING)) {
                case NORTH -> NORTH_SHAPE;
                case SOUTH -> SOUTH_SHAPE;
                case EAST  -> EAST_SHAPE;
                case WEST  -> WEST_SHAPE;
                default    -> WEST_SHAPE;
            };
        }

        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
            return getShape(state, level, pos, context);
        }

        @Override
        public BlockState getStateForPlacement(BlockPlaceContext ctx) {
            BlockPos pos = ctx.getClickedPos();
            BlockState currentState = ctx.getLevel().getBlockState(pos);
            Direction clickedSide = ctx.getClickedFace();

            if (currentState.is(this) && !currentState.getValue(DOUBLE)) {
                Direction existingFacing = currentState.getValue(FACING);
                if (clickedSide == existingFacing) {
                    return currentState.setValue(DOUBLE, true);
                }
                return null;
            }

            Direction newFacing = ctx.getHorizontalDirection().getOpposite();
            return defaultBlockState().setValue(FACING, newFacing).setValue(DOUBLE, false);
        }

        @Override
        public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
            if (state.getValue(DOUBLE)) {
                return false;
            }

            if (context.getItemInHand().getItem() == asItem()) {
                Direction existingFacing = state.getValue(FACING);
                if (context.getClickedFace() == existingFacing) {
                    return true;
                }
            }

            return super.canBeReplaced(state, context);
        }
    }
}
