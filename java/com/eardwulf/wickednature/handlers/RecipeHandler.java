package com.eardwulf.wickednature.handlers;

import com.eardwulf.wickednature.init.BlockInit;
import com.eardwulf.wickednature.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerCrafting()
	{
		
	
		GameRegistry.addShapelessRecipe(new ResourceLocation("tm:tutorial_ingot"), new ResourceLocation("tm:tutorial_items"), new ItemStack(ItemInit.tutorial_ingot, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(BlockInit.arcane_block))});
	}
}
