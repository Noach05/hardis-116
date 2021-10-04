package noach05.hardis.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import noach05.hardis.Hardis;

public class HardisItems {

    public static ItemGroup MAIN = new ItemGroup("hardis.hardis") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HardisItems.TARDIS_HEART.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hardis.MODID);

    public static final RegistryObject< Item > TARDIS_HEART = ITEMS.register("tardis_heart", () -> new Item(new Item.Properties().tab(HardisItems.MAIN)));
    public static final RegistryObject< Item > TARDIS_ACTIVATOR = ITEMS.register("tardis_activator", () -> new Item(new Item.Properties().tab(HardisItems.MAIN)));
    public static final RegistryObject< Item > TIME_VECTOR_GENERATOR = ITEMS.register("time_vector_generator", () -> new Item(new Item.Properties().tab(HardisItems.MAIN)));
    public static final RegistryObject< Item > RELATIVE_DIMENSION_STABILISER = ITEMS.register("relative_dimension_stabiliser", () -> new Item(new Item.Properties().tab(HardisItems.MAIN)));
    public static final RegistryObject< Item > SYMBIOTIC_NUCLEI = ITEMS.register("symbiotic_nuclei", () -> new Item(new Item.Properties().tab(HardisItems.MAIN)));
}