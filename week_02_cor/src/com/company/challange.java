package com.company;

public class challange {

    public boolean m1() {
        System.out.println("m1");
        return false;
    }

    public boolean m2() {
        System.out.println("m2");
        return true;
    }

    public boolean m3() {
        System.out.println("m3");
        return true;
    }

    public boolean m4() {
        System.out.println("m4");
        return true;
    }

    public void stuff() {
        System.out.println("Hi");
    }

    public void challange1() {
        System.out.println("\n");

        boolean v1 = m1();
        boolean v2 = m2();
        boolean v3 = m3();
        boolean v4 = m4();

        if (v1 | v2 | v3 | v4) {
            stuff();
        }
    }

    public void foo1(){
        System.out.println("foo1");
    }

    public void challange2(int i){

        if (i == 0){
            foo1();
        }else if(i==1){
            foo1();
        }else{
            foo1();
        }
    }

    public void challange3(){

        int i;
        for (i =-1; i >>> 0 < 0;  i--){ //or change to i++ and from < to >

        }
        System.out.println(i);
    }

}

