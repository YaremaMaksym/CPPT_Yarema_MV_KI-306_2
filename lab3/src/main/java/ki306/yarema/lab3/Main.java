package ki306.yarema.lab3;

import ki306.yarema.lab3.models.Filter;
import ki306.yarema.lab3.models.GasMask;

import java.io.IOException;

public class Main {
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