package me.leonardjackson.jumpglider.config;

import java.io.File;

import me.leonardjackson.jumpglider.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {

    public static Configuration config;

    public static boolean customControls = Defaults.customControls;
    public static String flyKey = Defaults.flyKey;

    public static void preInit(FMLPreInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new Config());

        config = new Configuration(new File(event.getModConfigurationDirectory(), Reference.MOD_ID + ".cfg"));

    }
}
