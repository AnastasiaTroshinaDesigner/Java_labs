package Laba_1.AbstractFabric;

class WebInput extends Input {
    @Override
    public void render() {
        System.out.println("render WebInput with value: " + getValue());
    }
}
