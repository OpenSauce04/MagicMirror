package it.ostpol.terraria.util;

import it.ostpol.terraria.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHandler {
	public static SoundEvent magicMirror;
	
	private static int size = 0;
	
	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();
		
		magicMirror = register("magicMirror");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation loc = new ResourceLocation(Reference.MOD_ID + ":"+name);
		SoundEvent e = new SoundEvent(loc);
		
		SoundEvent.REGISTRY.register(size, loc, e);
		size++;
		
		System.out.println("SoundHandler -> Register Sound: "+name);
		return e;
	}
}
