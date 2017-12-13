package com.company;

public class debugClass {


    public void test() {
        long Fibn, Fibn_1 = 1, Fibn_2 = 1;
        long[] fib = new long[200];
        fib[0] = fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            Fibn = Fibn_1 + Fibn_2;
            fib[i] = Fibn;
            Fibn_2 = Fibn_1;
            Fibn_1 = Fibn;
            System.out.println(Fibn);
        }
    }
}

