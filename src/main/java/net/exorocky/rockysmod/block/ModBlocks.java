package net.exorocky.rockysmod.block;

import net.exorocky.rockysmod.RockyMod;
import net.exorocky.rockysmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(1f).requiresTool().hardness(2f)), new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MAIN));
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool().hardness(2f)), new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MAIN));

    private static Block registerBlock(String name, Block block, FabricItemSettings settings) {
        registerBlockItem(name, block, settings);
        return Registry.register(Registry.BLOCK, new Identifier(RockyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, FabricItemSettings settings) {
        return Registry.register(Registry.ITEM, new Identifier(RockyMod.MOD_ID, name), new BlockItem(block, settings));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for modid:" + RockyMod.MOD_ID);
    }

}
