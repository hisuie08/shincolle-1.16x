package me.nashiroaoi.shincolle.block;

import me.nashiroaoi.shincolle.Shincolle;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Shincolle.ModID);
    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
