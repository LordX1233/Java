import java.util.Scanner;

public class Posorneg {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Whats your number?: ");        
        Integer number = ask.nextInt();
        if (number < 0){
            System.out.println("Its a negative");
        } else if ( number > 0){
            System.out.println("Its positive");
        }else{
            System.out.println("Its zero");
        }
        ask.close();
        }
}
