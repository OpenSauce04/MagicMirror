package it.ostpol.terraria.proxy;

import it.ostpol.terraria.init.ModItems;

public class ClientProxy implements CommonProxy{
	@Override
	public void init() {
		ModItems.registerRenders();
		
	}
}
