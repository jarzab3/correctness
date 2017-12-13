package com.company;

public class while_and_do {

    public static void loop1() {
        int i = 0;
        while (i < 3) {
            System.out.println("During : " + i);//3 x i = 3
            i++;
        }
        System.out.println("After : " + i); //i = 3
    }

    public static void loop2() {
        int i = 3;
        while (i < 3) {
            System.out.println("During : " + i);//0
            i++;
        }
        System.out.println("After : " + i);//i=3
    }

    public static void loop3() {

        int i = 3;
        do {
            System.out.println("During : " + i); //1 x i = 4
            i++;
        } while (i < 3);
        System.out.println("After : " + i);
    }
}
