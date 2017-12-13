
package com.company;

public class warm_up {

    public static void countPixels() { int pixels=0;
        int numrows=40;
        int numcols=30;
        for (int i=0; i<numrows; i++) for (int j=0; j<numcols; j++)
            pixels++;

        System.out.println(pixels);
    }

}
