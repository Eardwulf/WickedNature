package com.eardwulf.wickednature.handlers;

import com.eardwulf.wickednature.init.BlockInit;
import com.eardwulf.wickednature.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
	public static void Client()
	{	
		RecipeHandler.registerCrafting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		BlockInit.registerRenders();
		
	
	}
}
