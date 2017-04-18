package it.ostpol.terraria.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.magicMirror), "DGD", "GEG", "DGD", 'D', Items.DIAMOND, 'G', Blocks.GLASS, 'E', Items.ENDER_PEARL);
	}
}
