package me.leonardjackson.jumpglider;

public class Reference {
	public static final String MOD_ID = "jumpglider";
	public static final String NAME = "Jump Glider";
	public static final String VERSION = "A1.4";
	public static final String ACCEPTED_VERSIONS = "1.10.2";

	public static final String CLIENT_PROXY_CLASS = "me.leonardjackson.jumpglider.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.leonardjackson.jumpglider.proxy.ServerProxy";
	
	public static enum JumpGliderItems {
		
		JUMPGLIDERWING("jumpGliderWing", "ItemJumpGliderWing"),
		DARKNESS_INFUSED_IRON("darknessInfusedIron", "ItemDarknessInfusedIron"),
		CROSS_OF_DARKNESS("crossOfDarkness", "ItemCrossOfDarkness"),
		DARK_IRON_SWORD("darkIronSword", "ItemDarkIronSword"),
		DARK_IRON_PICKAXE("darkIronPickaxe", "ItemDarkIronPickaxe"),
		DARK_IRON_AXE("darkIronAxe", "ItemDarkIronAxe"),
		DARK_IRON_SHOVEL("darkIronShovel", "ItemDarkIronShovel"),
		DARK_IRON_HOE("darkIronHoe", "ItemDarkIronHoe");

		private String unlocalizedName;
		private String registryName;
		
		JumpGliderItems(String unlocalizedName, String registryName) {
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
	
	public static enum JumpGliderBlocks {

		DARKNESS_INFUSED_IRON_BLOCK("darknessInfusedIronBlock", "BlockDarknessInfusedIron"),
		DARKNESS_INFUSED_GLASS("darknessInfusedGlass", "BlockDarknessInfusedGlass");
		
		private String unlocalizedName;
		private String registryName;
		
		JumpGliderBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
