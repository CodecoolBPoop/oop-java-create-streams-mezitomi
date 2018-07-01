package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Long> {
    private long n1 = 1;
    private long n2 = 2;

    @Override
    public Long get() {
        long fibonacci = n1;
        long n3 = n2 + n1;
        n1 = n2;
        n2 = n3;
        return fibonacci;
    }
}
