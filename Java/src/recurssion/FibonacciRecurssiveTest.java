package recurssion;

public class FibonacciRecurssiveTest {
    public int fibonacciRecurssive(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n);
            return 1;
        }else{
            System.out.println(n);
            return n*fibonacciRecurssive(n-1);
        }
    }
    public static void main(String[] args) {
        FibonacciRecurssiveTest test = new FibonacciRecurssiveTest();
        System.out.println("-----------------------------------------------");
        System.out.println(test.fibonacciRecurssive(10));
    }
}
