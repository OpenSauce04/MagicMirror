package it.ostpol.terraria;

public class Reference {
	public static final String MOD_ID = "magicmirror";
	public static final String NAME = "MagicMirror";
	public static final String VERSION = "1.0";
	public static final String MC_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "it.ostpol.terraria.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "it.ostpol.terraria.proxy.ServerProxy";

	public static enum TerrariaItems {
		MAGIC_MIRROR("magicMirror", "ItemMagicMirror");
		
		private String unlocalizedName;
		private String registryName;
		
		TerrariaItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
