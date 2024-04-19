import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Whats your number?: ");        
        Integer number = ask.nextInt();
        if (number % 2 == 0){
            System.out.println("Its Even");
        }else{
            System.out.println("Its odd");
        }
        ask.close();
        }
}
