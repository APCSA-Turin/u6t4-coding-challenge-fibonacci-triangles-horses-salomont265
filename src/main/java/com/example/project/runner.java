package com.example.project;

public class runner {
    public static void main(String[] args) {

        Fibonacci fib1 = new Fibonacci(5);
        Fibonacci fib2 = new Fibonacci(11);
        Fibonacci fib3 = new Fibonacci(20);
        Fibonacci[] fibonaccis ={fib1,fib2,fib3};
        for(Fibonacci fib:fibonaccis){
            System.out.println(fib.getSequence().length);
        }

    }
}
