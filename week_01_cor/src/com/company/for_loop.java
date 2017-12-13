package com.company;

public class for_loop {

    public static void loop1() {
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("During : " + i);//3 x i = 2
        }
        System.out.println("After : " + i);//1 times i = 3
    }

    public static void loop2() {
        int i;
        for (i = 0; i <= 3; i++) {
            System.out.println("During : " + i);//4 x i = 3
        }
        System.out.println("After : " + i); // 1 time i = 4
    }

    public static void loop3() {
        int i;
        for (i = 0; i == 3; i++) {
            System.out.println("During : " + i);
        }
        System.out.println("After : " + i);
    }

}
