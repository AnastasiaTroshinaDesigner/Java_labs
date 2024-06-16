package Laba_1.AbstractFabric;


class AbstractFabricService {

    private FormElementFactory initFactory() {
        Configuration configuration = Configuration.initMob();

        FormElementFactory factory = new WebFormElementFactory();
        switch(configuration.getPlatform()) {
            case(1):
                factory = new WebFormElementFactory();
                break;
            case(2):
                factory = new MobFormElementFactory();
                break;
            default:
                try {
                    throw new Exception("Неизвестный тип платформы");
                } catch (Exception e) {

                }
                break;
        }
        return factory;
    }
    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.setValue("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }
    public void exec() {
        renderForm(initFactory());
    }
}
