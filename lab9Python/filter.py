class Filter:
    def __init__(self, type):
        self.type = type
        self.is_effective = True

    def make_ineffective(self):
        self.is_effective = False

    def get_is_effective(self):
        return self.is_effective

    def get_type(self):
        return self.type