package Laba_1.AbstractFabric;

class WebFormElementFactory implements FormElementFactory {
    @Override
    public Input createInput() {
        return new WebInput();
    }

    @Override
    public Button createButton() {
        return new WebButton();
    }
}
