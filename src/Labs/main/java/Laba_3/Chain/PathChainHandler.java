package Laba_3.Chain;

public class PathChainHandler extends ChainHandler {
    @Override
    public void process(Request request) {
        // Process path here
        request.appendToInputStream("3");
        if (nextHandler != null) {
            nextHandler.process(request);
        }
    }
}