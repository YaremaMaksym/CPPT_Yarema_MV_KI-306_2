package ki306.yarema.lab4.models;

/**
 * The CommanderEquipment interface represents the equipment used by the commander.
 * All classes that implement this interface must provide methods for getting the type of equipment
 * and sending an SOS signal.
 */
public interface CommanderEquipment {
    /**
     * Returns the type of equipment of the commander".
     */
    String getEquipmentType();

    /**
     * Sends an SOS signal in case of an emergency.
     */
    void sendSosSignal();
}
