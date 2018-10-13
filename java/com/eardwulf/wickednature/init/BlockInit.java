package com.eardwulf.wickednature.init;

import com.eardwulf.wickednature.Reference;
import com.eardwulf.wickednature.TutorialMod;
import com.eardwulf.wickednature.init.blocks.CustomBlock;
import com.eardwulf.wickednature.init.blocks.CustomBlockStairs;
import com.eardwulf.wickednature.init.blocks.activators.CustomBlockButton;
import com.eardwulf.wickednature.init.blocks.activators.CustomBlockPressurePlate;
import com.eardwulf.wickednature.init.blocks.fence.CustomBlockFence;
import com.eardwulf.wickednature.init.blocks.fence.CustomBlockFenceGate;
import com.eardwulf.wickednature.init.blocks.item.ItemBlockVariants;
import com.eardwulf.wickednature.init.blocks.slab.CustomBlockDoubleSlab;
import com.eardwulf.wickednature.init.blocks.slab.CustomBlockHalfSlab;
import com.eardwulf.wickednature.init.blocks.trees.CustomBlockLeaves;
import com.eardwulf.wickednature.init.blocks.trees.CustomBlockLog;
import com.eardwulf.wickednature.init.blocks.trees.CustomBlockPlanks;
import com.eardwulf.wickednature.init.blocks.trees.CustomBlockSapling;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block arcane_block;
	public static Block arcane_stairs;
	public static CustomBlockHalfSlab arcane_slab_half;
	public static CustomBlockDoubleSlab arcane_slab_double;
	public static CustomBlockFence arcane_fence;
	public static CustomBlockFenceGate arcane_fence_gate;
	public static CustomBlockPressurePlate arcane_pressure_plate;
	public static CustomBlockButton arcane_button;
	public static Block blood_block;
	public static Block blood_stairs;
	public static CustomBlockHalfSlab blood_slab_half;
	public static CustomBlockDoubleSlab blood_slab_double;
	public static CustomBlockFence blood_fence;
	public static CustomBlockFenceGate blood_fence_gate;
	public static CustomBlockPressurePlate blood_pressure_plate;
	public static CustomBlockButton blood_button;
	
	public static Block planks, leaves, log, sapling;
		
	public static void init()
	{
		arcane_block = new CustomBlock("arcane_block", 1.0F, 3.5F);
		arcane_stairs = new CustomBlockStairs("arcane_stairs", arcane_block.getDefaultState());
		arcane_slab_half = new CustomBlockHalfSlab("arcane_slab_half", 2.5F, 4.5F);
		arcane_slab_double = new CustomBlockDoubleSlab("arcane_slab_double", 2.5F, 4.5F);
		arcane_fence = new CustomBlockFence("arcane_fence", 2.5F, 4.5F);
		arcane_fence_gate = new CustomBlockFenceGate("arcane_fence_gate", 2.5F, 4.5F);
		arcane_pressure_plate = new CustomBlockPressurePlate("arcane_pressure_plate", 2.5F, 4.5F);
		arcane_button = new CustomBlockButton("arcane_button", 2.5F, 4.5F);
		blood_block = new CustomBlock("blood_block", 1.0F, 3.5F);
		blood_stairs = new CustomBlockStairs("blood_stairs", blood_block.getDefaultState());
		blood_slab_half = new CustomBlockHalfSlab("blood_slab_half", 2.5F, 4.5F);
		blood_slab_double = new CustomBlockDoubleSlab("blood_slab_double", 2.5F, 4.5F);
		blood_fence = new CustomBlockFence("blood_fence", 2.5F, 4.5F);
		blood_fence_gate = new CustomBlockFenceGate("blood_fence_gate", 2.5F, 4.5F);
		blood_pressure_plate = new CustomBlockPressurePlate("blood_pressure_plate", 2.5F, 4.5F);
		blood_button = new CustomBlockButton("blood_button", 2.5F, 4.5F);
				
		planks = new CustomBlockPlanks("planks");
		log = new CustomBlockLog("log");
		leaves = new CustomBlockLeaves("leaves");
		sapling = new CustomBlockSapling("sapling");
	}
	
	public static void register()
	{
		registerBlock(arcane_block);
		registerBlock(arcane_stairs);
		registerBlock(arcane_slab_half, new ItemSlab(arcane_slab_half, arcane_slab_half, arcane_slab_double));
		ForgeRegistries.BLOCKS.register(arcane_slab_double);
		registerBlock(arcane_fence);
		registerBlock(arcane_fence_gate);
		registerBlock(arcane_button);
		registerBlock(arcane_pressure_plate);
		registerBlock(blood_block);
		registerBlock(blood_stairs);
		registerBlock(blood_slab_half, new ItemSlab(blood_slab_half, blood_slab_half, blood_slab_double));
		ForgeRegistries.BLOCKS.register(blood_slab_double);
		registerBlock(blood_fence);
		registerBlock(blood_fence_gate);
		registerBlock(blood_button);
		registerBlock(blood_pressure_plate);
		
	
		registerBlockWithVariants(planks, new ItemBlockVariants(planks));
		registerBlockWithVariants(log, new ItemBlockVariants(log));
		registerBlockWithVariants(leaves, new ItemBlockVariants(leaves));
		registerBlockWithVariants(sapling, new ItemBlockVariants(sapling));
	}
	
	public static void registerRenders()
	{
		for(int i = 0; i < CustomBlockPlanks.EnumType.values().length; i++)
		{
			registerRender(planks, i, "planks_" + CustomBlockPlanks.EnumType.values()[i].getName());
			registerRender(log, i, "log_" + CustomBlockPlanks.EnumType.values()[i].getName());
			registerRender(leaves, i, "leaves_" + CustomBlockPlanks.EnumType.values()[i].getName());
			registerRender(sapling, i, "sapling_" + CustomBlockPlanks.EnumType.values()[i].getName());
		}
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(TutorialMod.WickedNature);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(TutorialMod.WickedNature);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlockWithVariants(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(TutorialMod.WickedNature);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
	}
	
	public static void registerRender(Block block, int meta, String filename)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
	}
}
