package Laba_3.Chain;

public class MethodChainHandler extends ChainHandler {
    @Override
    public void process(Request request) {
        // Process method here
        request.appendToInputStream("2");
        if (nextHandler != null) {
            nextHandler.process(request);
        }
    }
}