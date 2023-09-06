package ki306.yarema.lab4.models;

/**
 * The CommanderGasMask class represents the commander's gas mask,
 * which implements the CommanderEquipment interface and inherits the properties of the GasMask class.
 *
 * @author Yarema Maksym
 * @version 1.0
 * @since version 1.0
 */
public class CommanderGasMask extends GasMask implements CommanderEquipment {

    /**
     * Returns the type of equipment of the commander - "Gas mask".
     *
     * @return type of commanders gas mask
     */
    @Override
    public String getEquipmentType() {
        return getType();
    }

    /**
     * Sends an SOS signal in case of an emergency.
     */
    @Override
    public void sendSosSignal() {
        log("Sending SOS signal...");
    }
}