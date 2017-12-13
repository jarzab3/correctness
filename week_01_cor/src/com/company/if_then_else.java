package com.company;

public class if_then_else {

    public static void ifthenelse1() {
        int i = 1, j = 1;
        if (i <= j)
            System.out.println("A");

        if (i == j) {
            System.out.println("B");
        }
    }

    public static void ifthenelse2() {
        int i = 1, j = 1;
        if (i <= j) {

        } else if (i == j) {
            System.out.println("B");
        }
    }

    public static void transformed(){
        System.out.println("\n");

        int i = 1, j = 1;

        boolean tr = true;

        while (i<=j){
            System.out.println("A");
            break;
        } if (i != j) {
            System.out.println("B");
        }

    }

}
