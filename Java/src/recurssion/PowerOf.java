package recurssion;

public class PowerOf {
    public int powerOf(int number, int power) {
        if (power == 1) {
            return number;
        }
        if (power == 0) {
            return 1;
        }
        if (power < 0) {
            return 1;
        }
        return number*powerOf(number, power-1);
    }
    public static void main(String[] args) {
        PowerOf powerOf = new PowerOf();
        System.out.println(powerOf.powerOf(2, 3));
    }
}
