package noach05.hardis.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import noach05.hardis.Hardis;
import noach05.hardis.items.HardisItems;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, Hardis.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Items
        add(HardisItems.RELATIVE_DIMENSION_STABILISER.get(), "Relative Dimension Stabiliser");
        add(HardisItems.SYMBIOTIC_NUCLEI.get(), "Symbiotic Nuclei");
        add(HardisItems.TARDIS_ACTIVATOR.get(), "TARDIS Activator");
        add(HardisItems.TIME_VECTOR_GENERATOR.get(), "Time Vector Generator");
        add(HardisItems.TARDIS_HEART.get(), "Heart of the Tardis");

        //Tabs
        add("itemGroup.hardisbase.hardis", "HARDIS");
    }

    protected void addInformation() {
        add(HardisItems.TARDIS_HEART.get(), "This is what powers The TARDIS");
    }
}