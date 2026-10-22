package recurssion;

public class PowerOfrecussionLoop {
    public static void main(String[] args) {
        int i = 0;
        int n = 5;
        int power = 1;

        while(i<n){
            power = power * 2;
            i = i + 1;
        }
        System.out.println(power);
    }
}
