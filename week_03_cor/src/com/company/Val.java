package com.company;

public class Val {
    public static void incr(int i) {
        i++;
    }


    public static void incr(Int_inside v) {
        v.i++;
    }

    public static void test1() {
        int i = 0;
        System.out.println("Current value = " + i + ", calling method.");
        incr(i);
        System.out.println("Current value = " + i);
    }

    public static void test2() {
        Int_inside v = new Int_inside(0);
        System.out.println("Current value = " + v.i + ", calling method.");
        incr(v);
        System.out.println("Current value = " + v.i);
    }

    public static void test3() {
        Int_inside i = new Int_inside(1);
        Int_inside j = new Int_inside(1);
        if (i == j) {
            System.out.println("i==j");
        } else {
            System.out.println("i!=j");
        }
    }


    public static void test4() {
        Int_inside i = new Int_inside(1);
        Int_inside j = new Int_inside(1);
        if (i.equals(j)) {
            System.out.println("i==j");

        } else {
            System.out.println("i!=j");
        }
    }


}