package ki306.yarema.lab4.models;

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
