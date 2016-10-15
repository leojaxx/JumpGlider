package me.leonardjackson.jumpglider;

public class Reference {

	public static final String MOD_ID = "jumpglider";
	public static final String NAME = "Jump Glider";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "me.leonardjackson.jumpglider.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.leonardjackson.jumpglider.proxy.ServerProxy";
	
	public static enum JumpGliderItems {
		POLE("pole", "ItemPole"),
		CLOTH("cloth", "ItemCloth"),
		GLUE("glue", "ItemGlue"),
		SPRING("spring", "ItemSpring"),
		GLIDER_WING("glider_wing", "ItemGliderWing"),
		GLIDER_WINGS("glider_wings", "ItemGliderWings"),
		PROTECTED_GLIDER_WINGS("protected_glider_wings", "ItemProtectedGliderWings"),
		JUMP_BOOTS("jump_boots", "ItemJumpBoots");
		
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

}
