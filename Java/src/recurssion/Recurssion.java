package recurssion;

public class Recurssion {
    public void recursiveMethod(int number){
        if (number < 1){
            System.out.println("EXIT!");
        }else{
            recursiveMethod(number - 1);
            System.out.println(number);
        }

    }

    public static void main(String[] args) {
        Recurssion recurssion = new Recurssion();
        recurssion.recursiveMethod(10);
    }
}
