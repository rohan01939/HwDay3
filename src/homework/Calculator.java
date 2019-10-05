package homework;

public class Calculator {
    public static void main(String[] args) {
        //non static return
        Calculator calculator = new Calculator();
        int r = calculator.addition(10, 5);
        int s = calculator.addition(50, 10, 5);
        //non static return
        System.out.println(r);
        System.out.println(s);

        //non static void
        calculator.devideof2(50, 2, 5);

        //static void
        devide(10, 5);
        //static return
        int w = calculator.devide(100, 5, 5);
        System.out.println(w);

    }

    //non static return
    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int x, int y, int z) {
        return x + y + z;
    }

    //non static void
    public void devideof2(int c, int d, int e) {
        System.out.println(c / d / e);

    }

    //static void
    public static void devide(int a, int b) {
        System.out.println(a / b);
    }

    //static return
    public static int devide(int a, int b, int c) {
        return a / b / c;
    }


}
