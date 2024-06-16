package Laba_1.Single;

class Connection {
    private static Connection instance;

    private Connection() {}
    public static Connection getInstance() {
        if(null != instance)
            return instance;

        instance = new Connection();
        return instance;
    }
}
