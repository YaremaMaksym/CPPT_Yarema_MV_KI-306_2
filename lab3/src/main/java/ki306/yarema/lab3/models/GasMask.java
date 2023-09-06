package ki306.yarema.lab3.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GasMask {
    private final String type;
    private Filter filter;
    private boolean isOn;
    private int usageCount;
    private boolean isSealed;
    private boolean isClean;
    private String logFileName;
    private FileWriter logFileWriter;

    public GasMask() {
        type = "EN14387";
        filter = new Filter("A2B2E2K2");
        isOn = false;
        usageCount = 0;
        isSealed = false;
        isClean = true;
        logFileName = "GasMaskLog.txt";

        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GasMask(String maskType, String filterType) {
        type = maskType;
        filter = new Filter(filterType);
        isOn = false;
        usageCount = 0;
        isSealed = false;
        isClean = true;
        logFileName = "GasMaskLog.txt";

        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnOn() {
        isOn = true;
        log("Gas mask is turned on.");
    }

    public void turnOff() {
        isOn = false;
        log("Gas mask is turned off.");
    }

    public void replaceFilter(Filter newFilter) {
        filter = newFilter;
        log("Filter replaced with a new one.");
    }

    public void breathe() {
        if (isOn && isSealed && filter.isEffective()) {
            incrementUsage();
            log("Breathed safely using the gas mask.");
        } else {
            log("Gas mask is not sealed properly or the filter is not effective.");
        }
    }

    public void sealMask() {
        isSealed = true;
        log("Gas mask is sealed.");
    }

    public void unsealMask() {
        isSealed = false;
        log("Gas mask is unsealed.");
    }

    public void cleanMask() {
        isClean = true;
        log("Gas mask is cleaned.");
    }

    public void incrementUsage() {
        usageCount++;
    }

    public void cleanAndReplaceFilter() {
        if (!isClean) {
            cleanMask();
        }
        replaceFilter(new Filter("A2B2E2K2"));
        log("Gas mask is cleaned and the filter is replaced.");
    }

    public void checkStatus() {
        String status = "Gas Mask Status:\n";
        status += "Type: " + type + "\n";
        status += "Filter Type: " + filter.getType() + "\n";
        status += "Is On: " + isOn + "\n";
        status += "Usage Count: " + usageCount + "\n";
        status += "Is Sealed: " + isSealed + "\n";
        status += "Is Clean: " + isClean + "\n";
        log(status);
    }

    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dispose() throws IOException {
        logFileWriter.close();
    }
}

