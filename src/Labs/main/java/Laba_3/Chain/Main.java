package Laba_3.Chain;

public class Main {

    public static void main(String[] args) {
        ChainService service = new ChainService();
        Request result = service.exec("");
        System.out.println(result.getInputStream());  // Output: 123
    }
}