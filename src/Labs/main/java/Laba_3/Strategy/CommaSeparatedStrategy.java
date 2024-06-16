package Laba_3.Strategy;

import java.util.ArrayList;

public class CommaSeparatedStrategy implements Strategy {
    @Override
    public String process(ArrayList<String> strings) {
        return String.join(", ", strings);
    }
}
