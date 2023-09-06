package ki306.yarema.lab4.models;

public class CommanderGasMask extends GasMask implements CommanderEquipment {

    @Override
    public String getEquipmentType() {
        return getType();
    }

    @Override
    public void sendSosSignal() {
        log("Sending SOS signal...");
    }
}
