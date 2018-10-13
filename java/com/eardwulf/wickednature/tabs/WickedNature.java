package com.eardwulf.wickednature.tabs;

import com.eardwulf.wickednature.init.BlockInit;
import com.eardwulf.wickednature.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WickedNature extends CreativeTabs
{
	public WickedNature(String label) { super("wickednature"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.sapling);}
}
