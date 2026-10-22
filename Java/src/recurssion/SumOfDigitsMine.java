package recurssion;

public class SumOfDigitsMine {
    int sum;

    public int getSumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        if (number < 0 ) {
            return 0;
        }
        sum = number%10 + getSumOfDigits(number/10);
        return sum;
    }
    public static void main(String[] args) {
        SumOfDigitsMine sum = new SumOfDigitsMine();
        System.out.println(sum.getSumOfDigits(11));
    }
}
