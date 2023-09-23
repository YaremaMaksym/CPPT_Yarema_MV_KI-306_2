from commander_gasMask import CommanderGasMask
from filter import Filter

def main():
    commander_gas_mask = CommanderGasMask("EN14387", "A2B2E2K2")

    commander_gas_mask.check_status()

    commander_gas_mask.breathe()
    commander_gas_mask.breathe()

    commander_gas_mask.seal_mask()

    commander_gas_mask.breathe()

    commander_gas_mask.turn_night_vision_on()

    commander_gas_mask.breathe()

    commander_gas_mask.replace_filter(Filter("A1B1E1K1"))

    commander_gas_mask.check_status()

    commander_gas_mask.send_sos_signal()

    commander_gas_mask.clean_and_replace_filter()

if __name__ == "__main__":
    main()
