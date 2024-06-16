package Laba_3.Chain;

public class HeaderChainHandler extends ChainHandler {
    @Override
    public void process(Request request) {
        // Process header here
        request.appendToInputStream("1");
        if (nextHandler != null) {
            nextHandler.process(request);
        }
    }
}