package ki306.yarema.lab4;

import ki306.yarema.lab4.models.Filter;
import ki306.yarema.lab4.models.ComanderGasMask;

import java.io.IOException;

/**
 * Gas Mask Application class implements main method for CommanderGasMask
 class possibilities demonstration
 *
 * @author Yarema Maksym
 * @version 1.0
 * @since version 1.0
 */
public class GasMaskApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ComanderGasMask comanderGasMask = new ComanderGasMask();

        comanderGasMask.checkStatus();

        comanderGasMask.breathe();
        comanderGasMask.breathe();

        comanderGasMask.sealMask();

        comanderGasMask.breathe();

        comanderGasMask.turnNightVisionOn();

        comanderGasMask.breathe();

        comanderGasMask.replaceFilter(new Filter("A1B1E1K1"));

        comanderGasMask.checkStatus();

        comanderGasMask.sendSosSignal();

        comanderGasMask.cleanAndReplaceFilter();

        try {
            comanderGasMask.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}