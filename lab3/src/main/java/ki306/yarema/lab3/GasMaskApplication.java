package ki306.yarema.lab3;

import java.io.IOException;

/**
 * Gas Mask Application class implements main method for GasMask
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
        GasMask gasMask = new GasMask();

        gasMask.checkStatus();

        gasMask.breathe();
        gasMask.breathe();

        gasMask.sealMask();

        gasMask.breathe();

        gasMask.turnNightVisionOn();

        gasMask.breathe();

        gasMask.replaceFilter(new Filter("A1B1E1K1"));

        gasMask.checkStatus();

        gasMask.cleanAndReplaceFilter();

        try {
            gasMask.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}