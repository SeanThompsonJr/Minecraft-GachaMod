package net.sean.seanGatcha;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SeanGatchaMod.MODID);

    /// add items here
    //part 1 - register the item here
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () ->
            new Item(new Item.Properties()));
    //part 2 - add registered item to creative mod tab
    //part 3 add the item to the lang file with this syntax
    // item.[mod id].[name of item used inside the register method not the name of the variable in caps]
    //part 4 make a file for the item in the model/item folder in this sytax
    //[name of item used inside the register method not the name of the variable in caps].json
    //part 5 inside that file from part 4. copy this sytax.
    /*
    {
    "parent": "item/generated",
    "textures": {
    "layer0": "[modid]:item/[name of item used inside the register method not the name of the variable in caps]"
        }
     }
     */
    //part 6 - add the png texture to the textures/item folder using this syntax
    //[name of item used inside the register method not the name of the variable in caps].png


    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () ->
            new Item(new Item.Properties()));

    /// add items above

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
