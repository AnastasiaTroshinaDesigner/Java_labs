package Laba_1.AbstractFabric;

abstract class Input {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract void render();
}
