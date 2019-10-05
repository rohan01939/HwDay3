package homework;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int r = calculator.addition(10, 5);
        int s = calculator.devide(50, 10, 5);

        System.out.println(r);
        System.out.println(s);

    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int devide(int x, int y, int z) {
        return x - y - z;
    }


}
