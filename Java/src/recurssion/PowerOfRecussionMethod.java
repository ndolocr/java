package recurssion;

public class PowerOfRecussionMethod {
    public int powerOf(int n) {
        if (n == 0){
            return 1;
        }else{
            return (2*powerOf(n-1));
        }
    }
    public static void main(String[] args) {
        PowerOfRecussionMethod p = new PowerOfRecussionMethod();
        System.out.println(p.powerOf(5));
    }
}
