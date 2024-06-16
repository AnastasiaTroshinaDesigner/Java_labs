package Laba_3.Strategy;

import java.util.ArrayList;

class StrategyServiceImpl implements StrategyService {

    private Strategy strategy;

    public StrategyServiceImpl(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String exec(ArrayList<String> strings) {
        String result = "";
        if (strings.isEmpty()) {
            return result;
        }
        return strategy.process(strings);
    }

    public StrategyService setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }
}

