from filter import Filter

class GasMask:
    def __init__(self, mask_type, filter_type):
        self.type = mask_type
        self.filter = Filter(filter_type)
        self.is_night_vision_on = False
        self.usage_count = 0
        self.is_sealed = False
        self.is_clean = True

    def turn_night_vision_on(self):
        self.is_night_vision_on = True
        print("Night vision mode is turned on.")

    def turn_night_vision_off(self):
        self.is_night_vision_on = False
        print("Night vision mode is turned off.")

    def replace_filter(self, new_filter):
        self.filter = new_filter
        print("Filter replaced with a new one.")

    def breathe(self):
        if self.is_sealed and self.filter.is_effective:
            self.increment_usage()
            print("Breathed safely using the gas mask.")
        else:
            print("Gas mask is not sealed properly or the filter is not effective.")

    def seal_mask(self):
        self.is_sealed = True
        print("Gas mask is sealed.")

    def unseal_mask(self):
        self.is_sealed = False
        print("Gas mask is unsealed.")

    def clean_mask(self):
        self.is_clean = True
        print("Gas mask is cleaned.")

    def increment_usage(self):
        self.usage_count += 1

    def clean_and_replace_filter(self):
        if not self.is_clean:
            self.clean_mask()
        self.replace_filter(Filter("A2B2E2K2"))
        print("Gas mask is cleaned and the filter is replaced.")

    def check_status(self):
        status = "Gas Mask Status:\n"
        status += "Type: " + self.type + "\n"
        status += "Filter Type: " + self.filter.get_type() + "\n"
        status += "Is Night Vision On: " + str(self.is_night_vision_on) + "\n"
        status += "Usage Count: " + str(self.usage_count) + "\n"
        status += "Is Sealed: " + str(self.is_sealed) + "\n"
        status += "Is Clean: " + str(self.is_clean) + "\n"
        print(status)

    def get_type(self):
        return self.type