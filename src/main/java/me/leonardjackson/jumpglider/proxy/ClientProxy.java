package me.leonardjackson.jumpglider.proxy;

import me.leonardjackson.jumpglider.init.ModItems;

public class ClientProxy implements CommonProxy {
	@Override
	public void init() {
		ModItems.registerRenders();
	}
}
