public class Main {

    public static void foo() {
        System.out.println("work");
    }

    public static void bar() {
        System.out.println("stop");
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int res;
        res = c.calc(3, 4);

        System.out.println(res);





    }
}
