package com.company;

public class practice {

    public static boolean get_false() {
        System.out.println("Returning false.");
        return false;
    }

    public static void booleans1() {
        int i = 1;
        int j = 2;
        if (i == j && get_false()) {
            System.out.println("Inside if-clause.");
        } else {
            System.out.println("Inside else-clause.");
        }
    }

    public static void booleans2() {
        int i = 1;
        int j = 2;
        if (i != j || !get_false()) {

            System.out.println("Inside if-clause.");
        } else {
            System.out.println("Inside else-clause.");
        }
    }

    public static void switch1() {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
        }
    }

    public static void integers1() {
        int i;
        for (i = 1; i > 0; i++) {
        }
        System.out.println(i);
    }

    public static void integers2() {
        int i;
        for (i = 101; i > 0; i = i / 2) {
        }
        System.out.println("Finished, i = " + i);
    }

    public static void integers3() {
        int i;
        for (i = 1; i > 0; i = i * 2) {
        }
        System.out.println("Finished, i = " + i);
    }

    public static void foo(int i) {
        System.out.println("foo1" + i);
    }

    public static void switch1(int i) {
        switch (i) {
            case 1:
                foo(1);
                break;
            case 2:
                foo(2);
                break;
            default:
                foo(3);
                break;
        }
    }

    public void sw(int i){
        if (i == 1){
            foo(1);
        } else if (i  == 2 ){
            foo(2);
        }
        else{
            foo(3);
        }

    }

}
