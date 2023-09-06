package ki306.yarema.lab4.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Class Lab2YaremaKI306 implements laboratory work №4
 * An abstract class representing a gas mask and allowing various operations with it.
 * The gas mask has a type, a filter, a state (on or off), a usage count,
 * a sealing state, and a cleanliness state.
 *
 * @author Yarema Maksym
 * @version 1.2
 * @since version 1.0
 *
 */
public abstract class GasMask {
    private final String type;
    private Filter filter;
    private boolean isNightVisionOn;
    private int usageCount;
    private boolean isSealed;
    private boolean isClean;
    private String logFileName;
    private FileWriter logFileWriter;

    /**
     * Constructor for creating a gas mask with default values.
     * Sets the mask type to "EN14387," the filter type to "A2B2E2K2," and other initial values.
     */
    public GasMask() {
        type = "EN14387";
        filter = new Filter("A2B2E2K2");
        isNightVisionOn = false;
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

    /**
     * Constructor for creating a gas mask with specified parameters.
     * @param maskType The type of the gas mask.
     * @param filterType The type of the filter.
     */
    public GasMask(String maskType, String filterType) {
        type = maskType;
        filter = new Filter(filterType);
        isNightVisionOn = false;
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

    /**
     * Turn on night vision mode for the gas mask.
     */
    public void turnNightVisionOn() {
        isNightVisionOn = true;
        log("Night vision mode is turned on.");
    }

    /**
     * Turn off night vision mode for the gas mask.
     */
    public void turnNightVisionOff() {
        isNightVisionOn = false;
        log("Night vision mode is turned off.");
    }

    /**
     * Replace the filter of the gas mask with a new one.
     * @param newFilter The new filter.
     */
    public void replaceFilter(Filter newFilter) {
        filter = newFilter;
        log("Filter replaced with a new one.");
    }

    /**
     * Breathe through the gas mask.
     */
    public void breathe() {
        if (isSealed && filter.isEffective()) {
            incrementUsage();
            log("Breathed safely using the gas mask.");
        } else {
            log("Gas mask is not sealed properly or the filter is not effective.");
        }
    }

    /**
     * Seal the gas mask.
     */
    public void sealMask() {
        isSealed = true;
        log("Gas mask is sealed.");
    }

    /**
     * Unseal the gas mask.
     */
    public void unsealMask() {
        isSealed = false;
        log("Gas mask is unsealed.");
    }

    /**
     * Clean the gas mask.
     */
    public void cleanMask() {
        isClean = true;
        log("Gas mask is cleaned.");
    }

    /**
     * Increment the usage count of the gas mask.
     */
    private void incrementUsage() {
        usageCount++;
    }

    /**
     * Clean the gas mask and replace the filter with a new one.
     */
    public void cleanAndReplaceFilter() {
        if (!isClean) {
            cleanMask();
        }
        replaceFilter(new Filter("A2B2E2K2"));
        log("Gas mask is cleaned and the filter is replaced.");
    }

    /**
     * Check the status of the gas mask and display status information.
     */
    public void checkStatus() {
        String status = "Gas Mask Status:\n";
        status += "Type: " + type + "\n";
        status += "Filter Type: " + filter.getType() + "\n";
        status += "Is Night Vision On: " + isNightVisionOn + "\n";
        status += "Usage Count: " + usageCount + "\n";
        status += "Is Sealed: " + isSealed + "\n";
        status += "Is Clean: " + isClean + "\n";
        log(status);
    }

    /**
     * Return type of gas mask.
     */
    public String getType() {
        return type;
    }

    /**
     * Write a message to the log file.
     * @param message The message to be logged.
     */
    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Dispose of the gas mask and close the log file.
     * @throws IOException Thrown in case of input/output errors.
     */
    public void dispose() throws IOException {
        logFileWriter.close();
    }
}

