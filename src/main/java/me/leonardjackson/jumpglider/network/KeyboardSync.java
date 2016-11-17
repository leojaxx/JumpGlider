package me.leonardjackson.jumpglider.network;

import io.netty.buffer.ByteBuf;
import me.leonardjackson.jumpglider.event.SyncHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class KeyboardSync implements IMessage, IMessageHandler<KeyboardSync, IMessage> {

    public boolean launchedState;

    public KeyboardSync() {}

    public KeyboardSync(boolean launchedState) {
        this.launchedState = launchedState;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.launchedState = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(this.launchedState);
    }

    @Override
    public IMessage onMessage(KeyboardSync message, MessageContext context) {
        EntityPlayer player = context.getServerHandler().playerEntity;
        if (player != null) {
            SyncHandler.processKeyUpdate(player, message.launchedState);
        }

        return null;
    }



}
