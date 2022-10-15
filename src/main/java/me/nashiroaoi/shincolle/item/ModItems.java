package me.nashiroaoi.shincolle.item;

import me.nashiroaoi.shincolle.Shincolle;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Shincolle.ModID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> AbyssMetal = ITEMS.register("abyssmetal",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> AbyssNugget = ITEMS.register("abyssnugget",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> Ammo = ITEMS.register("ammo",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> AmmoCon = ITEMS.register("ammocon",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> BlockDesk = ITEMS.register("blockdesk",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> BucketRepair = ITEMS.register("bucketrepair",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> DeskItemBook = ITEMS.register("deskitembook",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> DeskItemRadar = ITEMS.register("deskitemradar",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipAmmo = ITEMS.register("equipammo",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipArmor = ITEMS.register("equiparmor",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipCatapult = ITEMS.register("equipcatapult",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipCompass = ITEMS.register("equipcompass",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipFlare = ITEMS.register("equipflare",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipMachineGun = ITEMS.register("equipmachinegun",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipRadar = ITEMS.register("equipradar",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipSearchLight = ITEMS.register("equipsearchlight",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipTorpedo = ITEMS.register("equiptorpedo",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> EquipTurbine = ITEMS.register("equipturbine",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> InstantConMat = ITEMS.register("instantconmat",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> Grudge= ITEMS.register("grudge",
            () -> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> GrudgeSub = ITEMS.register("grudgesub",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> HeavyAmmo = ITEMS.register("heavyammo",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> HeavyAmmoCon = ITEMS.register("heavyammocon",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> KaitaiHammer = ITEMS.register("kaitaihammer",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> ModernKit = ITEMS.register("modernkit",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> MarriageRing = ITEMS.register("marriagering",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));

    public static final RegistryObject<Item> OpTool = ITEMS.register("optool",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> OwnerPaper = ITEMS.register("ownerpaper",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> PolyMetal = ITEMS.register("polymetal",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> PolyNugget = ITEMS.register("polynugget",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> RecipePaper = ITEMS.register("recipepaper",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> RepairGoddess = ITEMS.register("repairgoddess",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> ShipComb = ITEMS.register("shipcomb",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> TargetWrench = ITEMS.register("targetwrench",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> ToyAirPlane = ITEMS.register("toyairplane",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
    public static final RegistryObject<Item> TrainingBook = ITEMS.register("trainingbook",
            ()-> new Item(new Item.Properties().tab(Shincolle.creativeTabSC)));
}
