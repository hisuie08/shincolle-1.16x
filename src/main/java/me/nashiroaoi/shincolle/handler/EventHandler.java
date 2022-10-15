package me.nashiroaoi.shincolle.handler;

import me.nashiroaoi.shincolle.Shincolle;
import me.nashiroaoi.shincolle.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber
public class EventHandler {
    private static final Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public void onDrop(LivingDropsEvent event){
        Entity host = event.getEntity();
        LOGGER.log(Level.ALL,host.getType().toString());//Todo:inplement
    }
    @SubscribeEvent
    public void onJoin(PlayerEvent.ItemPickupEvent event){
        PlayerEntity player = event.getPlayer();
        ItemStack d = new ItemStack(ModItems.Grudge.get(),3);
        player.setItemInHand(Hand.MAIN_HAND,d);
    }
    @SubscribeEvent
    public void onEggUse(LivingEntityUseItemEvent event){
        ItemStack item = event.getItem();
        LOGGER.info(item);
    }
}
