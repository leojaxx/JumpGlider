package me.leonardjackson.jumpglider.proxy;

import me.leonardjackson.jumpglider.event.EventHandlerClient;
import me.leonardjackson.jumpglider.input.KeyBindings;
import me.leonardjackson.jumpglider.input.KeyHandler;
import me.leonardjackson.jumpglider.init.ModBlocks;
import me.leonardjackson.jumpglider.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		ModItems.registerRenders();
		ModItems.registerJumpGliderArmor();
		ModBlocks.registerRenders();
		MinecraftForge.EVENT_BUS.register(new EventHandlerClient());
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
        KeyBindings.init();
	}

}
