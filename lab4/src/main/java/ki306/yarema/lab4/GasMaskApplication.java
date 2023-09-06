package ki306.yarema.lab4;

import ki306.yarema.lab4.models.Filter;
import ki306.yarema.lab4.models.CommanderGasMask;

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
        CommanderGasMask commanderGasMask = new CommanderGasMask();

        commanderGasMask.checkStatus();

        commanderGasMask.breathe();
        commanderGasMask.breathe();

        commanderGasMask.sealMask();

        commanderGasMask.breathe();

        commanderGasMask.turnNightVisionOn();

        commanderGasMask.breathe();

        commanderGasMask.replaceFilter(new Filter("A1B1E1K1"));

        commanderGasMask.checkStatus();

        commanderGasMask.sendSosSignal();

        commanderGasMask.cleanAndReplaceFilter();

        try {
            commanderGasMask.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}