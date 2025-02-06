package com.alvarocm;

import org.junit.jupiter.api.Test;

public class TestFibonacci {
    
    @Test
    public void testFibonacci() {
        Fibonacci fib = new Fibonacci();
        int resultado = fib.fib(10);
        System.out.println("Fibonacci de 10: " + resultado);
    }

}
