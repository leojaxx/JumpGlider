package me.leonardjackson.jumpglider.event;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class SyncHandler {

    private static final Map<EntityPlayer, Boolean> launchKeyState = new HashMap<EntityPlayer, Boolean>();

    public static boolean isLaunchKeyDown(EntityLivingBase livingPlayer) {
        return !(livingPlayer instanceof EntityPlayer) || launchKeyState.containsKey(livingPlayer) && launchKeyState.get(livingPlayer);
    }

    public static void processKeyUpdate(EntityPlayer player, boolean keyFly) {
        launchKeyState.put(player, keyFly);
    }
}
