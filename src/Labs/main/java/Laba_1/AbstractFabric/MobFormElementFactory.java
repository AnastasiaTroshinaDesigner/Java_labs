package Laba_1.AbstractFabric;

class MobFormElementFactory implements FormElementFactory {
    @Override
    public Input createInput() {
        return new MobInput();
    }

    @Override
    public Button createButton() {
        return new MobButton();
    }
}
