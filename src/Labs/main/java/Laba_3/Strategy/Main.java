package Laba_3.Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new CommaSeparatedStrategy();
        StrategyServiceImpl service = new StrategyServiceImpl(strategy);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("example1");
        strings.add("example2");
        strings.add("example3");
        strings.add("example4");

        String result = service.exec(strings);
        System.out.println(result);
    }
}
