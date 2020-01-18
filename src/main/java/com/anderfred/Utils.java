package com.anderfred;

public class Utils {
    public static CustomPair swap(CustomPair pair) {
        int first = pair.getFirst();
        int second = pair.getSecond();
        first = first + second;
        second = first - second;
        first = first - second;
        pair.setFirst(first);
        pair.setSecond(second);
        return pair;
    }
}
