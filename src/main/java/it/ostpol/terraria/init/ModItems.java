package it.ostpol.terraria.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import it.ostpol.terraria.items.*;

public class ModItems {
	
	public static Item magicMirror;
	
	public static void init() {
		magicMirror = new magicMirror();
	}
	
	public static void register() {
		GameRegistry.register(magicMirror);
	}
	
	public static void registerRenders() {
		registerRender(magicMirror);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
