package Laba_3.Chain;

public abstract class ChainHandler {
    protected ChainHandler nextHandler;

    public ChainHandler next(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void process(Request request);
}