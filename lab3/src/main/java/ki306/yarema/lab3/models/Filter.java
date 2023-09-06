package ki306.yarema.lab3.models;

public class Filter {
    private final String type;
    private boolean isEffective;

    public Filter() {
        type = "A2B2E2K2";
        isEffective = true;
    }

    public Filter(String type) {
        this.type = type;
        isEffective = true;
    }

    public void makeIneffective() {
        isEffective = false;
    }

    public boolean isEffective() {
        return isEffective;
    }

    public String getType() {
        return type;
    }
}
