package Laba_1.Fabric;

class FabricMethodService {
    public void exec() {
        Configuration configuration = Configuration.initMob();

        Dialog dialog = new WebDialog();
        switch (configuration.getPlatform()) {
            case (1):
                dialog = new WebDialog();
                break;
            case (2):
                dialog = new MobDialog();
                break;
            default:
                try {
                    throw new Exception("Неизвестный тип платформы");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        dialog.render();
    }
}