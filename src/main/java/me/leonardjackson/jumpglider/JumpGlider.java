package me.leonardjackson.jumpglider;

import me.leonardjackson.jumpglider.init.ModItems;
import me.leonardjackson.jumpglider.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.NAME,
		version = Reference.VERSION,
		acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS
	)
public class JumpGlider {
	
	@Instance
	public static JumpGlider instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new JumpGliderTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("pre init event");
		
		ModItems.init();
		ModItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("init event");
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("post init event");
	}
}
