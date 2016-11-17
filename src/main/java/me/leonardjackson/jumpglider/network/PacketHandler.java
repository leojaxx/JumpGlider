package me.leonardjackson.jumpglider.network;

import me.leonardjackson.jumpglider.JumpGlider;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {

    private static int packetId = 0;

    public static SimpleNetworkWrapper INSTANCE = null;

    public PacketHandler() {}

    public static int nextId() {
        return packetId++;
    }

    public static void registerMessages(String channelName) {
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
        registerMessages();
    }


    public static void registerMessages() {
        JumpGlider.logger.info("Registering network messages");
        INSTANCE.registerMessage(KeyboardSync.class, KeyboardSync.class, nextId(), Side.SERVER);
    }
}
