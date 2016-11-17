package me.leonardjackson.jumpglider;

import me.leonardjackson.jumpglider.event.EventHandlerCommon;
import me.leonardjackson.jumpglider.event.SyncHandler;
import me.leonardjackson.jumpglider.init.ModBlocks;
import me.leonardjackson.jumpglider.init.ModCrafting;
import me.leonardjackson.jumpglider.init.ModItems;
import me.leonardjackson.jumpglider.network.PacketHandler;
import me.leonardjackson.jumpglider.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class JumpGlider {
	
	@Instance
	public static JumpGlider instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new JumpGliderCreativeTab();
	public static final Item.ToolMaterial darkIronToolMaterial = EnumHelper.addToolMaterial("DARKIRON", 3, 750, 7, 2.5F, 22);
	public static final ArmorMaterial darkIronArmorMaterial = EnumHelper.addArmorMaterial("DARKIRON", "jumpglider:jumpglider", 20, new int[] {2, 5, 4, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

	public static Logger logger;
	public static SyncHandler keyboard;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		logger = event.getModLog();
        logger.info("Jump Glider Go!!");

		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.init();
		PacketHandler.registerMessages("jumpglider");
		ModCrafting.register();
		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");
	}

}
