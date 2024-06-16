package Laba_3.Chain;

public class SessionChainHandler extends ChainHandler {
    @Override
    public void process(Request request) {
        // Process session here
        request.appendToInputStream("");
        if (nextHandler != null) {
            nextHandler.process(request);
        }
    }
}