from gasMask import GasMask

class CommanderGasMask(GasMask):
    def __init__(self, mask_type, filter_type):
        super().__init__(mask_type, filter_type)

    def get_equipment_type(self):
        return self.get_type()

    def send_sos_signal(self):
        print("Sending SOS signal...")