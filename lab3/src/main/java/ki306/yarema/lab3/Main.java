package ki306.yarema.lab3;

import ki306.yarema.lab3.models.Filter;
import ki306.yarema.lab3.models.GasMask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GasMask gasMask1 = new GasMask();

        gasMask1.turnOn();

        gasMask1.checkStatus();

        gasMask1.breathe();
        gasMask1.breathe();

        gasMask1.sealMask();

        gasMask1.breathe();
        gasMask1.breathe();

        gasMask1.replaceFilter(new Filter("A1B1E1K1"));

        gasMask1.checkStatus();

        gasMask1.cleanAndReplaceFilter();

        try {
            gasMask1.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}