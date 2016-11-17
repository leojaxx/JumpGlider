package me.leonardjackson.jumpglider.input;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class KeyBindings {

    public static KeyBinding launchKey;

    public static void init() {
        launchKey = new KeyBinding("key.getlaunched", Keyboard.KEY_SPACE, "key.categories.jumpglider");
        ClientRegistry.registerKeyBinding(launchKey);
    }

}
