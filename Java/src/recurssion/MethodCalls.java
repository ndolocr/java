package recurssion;

public class MethodCalls {
    public void numberOne() {
        numberTwo();
        System.out.println("Method 1");
    }

    public void numberTwo() {
        numberThree();
        System.out.println("Method 2");
    }

    public void numberThree() {
        numberFour();
        System.out.println("Method 3");
    }

    public void numberFour() {
        numberFive();
        System.out.println("Method 4");
    }

    public void numberFive() {
        System.out.println("Method 5. This is the last method.");
    }
    public static void main(String[] args) {
        MethodCalls m = new MethodCalls();
        m.numberOne();
    }
}
