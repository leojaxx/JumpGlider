package me.leonardjackson.jumpglider.input;

import me.leonardjackson.jumpglider.event.SyncHandler;
import me.leonardjackson.jumpglider.network.PacketHandler;
import me.leonardjackson.jumpglider.network.KeyboardSync;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {

        boolean launchedState;

        if (KeyBindings.launchKey.isKeyDown()) {
            launchedState = true;
            System.out.println("Space bar pressed");
        } else {
            launchedState = false;
        }

        PacketHandler.INSTANCE.sendToServer(new KeyboardSync(launchedState));
        SyncHandler.processKeyUpdate(Minecraft.getMinecraft().thePlayer, launchedState);
    }


}
